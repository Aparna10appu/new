package com.training.services;

import java.util.List;

import com.training.ifaces.CustomDao;
import com.training.model.Review;

public class ReviewService {

	
	private CustomDao<Review> dao;

	public ReviewService(CustomDao<Review> dao) {
		super();
		this.dao=dao;
		// TODO Auto-generated constructor stub
	}
	
	public boolean addReview(Review entity) {
		return dao.add(entity);
	}
	
	public List<Review> findAllReviews(){
		return dao.findAll();
	}
}
