package com.training.utils;
import static org.bson.codecs.configuration.CodecRegistries.*;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import com.mongodb.MongoClientSettings;
import  com.mongodb.client.*;
public class ConnectionUtils {
 static MongoClient client=null;
	
	public static MongoDatabase getDataBase(String dataBaseName) {
		MongoDatabase dataBase=null;
	
//		CodecRegistry pojoCodecRegistry=fromProviders(PojoCodecProvider.builder().automatic(true));
//		
//		CodecRegistry codecRegistry=fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
		
	    
		CodecRegistry pojoCodecRegistry=fromProviders(PojoCodecProvider.builder().automatic(true).build());

		CodecRegistry codecRegistry =fromRegistries(
		      MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);

		
		client= MongoClients.create("mongodb://localhost:27017");
			dataBase= client.getDatabase(dataBaseName);
			
			//since we r gng to use pojos we need pojocodecregistry
		dataBase=dataBase.withCodecRegistry(codecRegistry);
		return dataBase;
	}
		public static void close() {
			client.close();
		}
		public static void main(String[] args) {
			System.out.println(getDataBase("training"));
		}
	}

