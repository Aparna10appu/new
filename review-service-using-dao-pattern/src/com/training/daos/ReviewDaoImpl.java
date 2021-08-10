package com.training.daos;
import java.util.ArrayList;
import java.util.List;
import com.mongodb.MongoWriteException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.training.ifaces.CustomDao;
import com.training.model.*;
import com.training.utils.ConnectionUtils;
public class ReviewDaoImpl implements CustomDao<Review> {

	private MongoDatabase dataBase;
	private MongoCollection<Review> collection;
	
	public ReviewDaoImpl() {
		super();
		this.dataBase= ConnectionUtils.getDataBase("training");
	    this.collection=this.dataBase.getCollection("reviews", Review.class);
	}
	public ReviewDaoImpl(MongoDatabase dataBase) {
		super();
		this.dataBase = dataBase;
	}


	@Override
	public boolean add(Review t) {
		 boolean result=false;
		try {
			this.collection.insertOne(t);
			result=true;
			
			
		} catch(MongoWriteException e) {
           e.printStackTrace();
		}
		 
		 return false;
	}

	@Override
	public List<Review> findAll() {
	List<Review> list=new ArrayList<>();
     MongoCursor<Review> cursor=collection.find().cursor();
	
     while(cursor.hasNext()) {
    	 list.add(cursor.next());
     }
     
     return list;
	}

}
