package com.training;

import java.util.List;

import org.bson.types.ObjectId;

import com.training.daos.ReviewDaoImpl;
import com.training.ifaces.CustomDao;
import com.training.model.Review;
import com.training.services.ReviewService;
import com.training.utils.ConnectionUtils;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomDao<Review> dao=new ReviewDaoImpl();
		ReviewService service=new ReviewService(dao);
		
//	boolean result=service.addReview(new Review(new ObjectId(), "ups","laptop","124-gb",3));
//	
//	if(result) {
//	System.out.println("One Document Added");
//	}
//	
	
	
		List<Review> list=service.findAllReviews();
		
		for(Review eachReview: list) {
			System.out.println(eachReview);		}
	
	ConnectionUtils.close();
	}
	
	
	

}
