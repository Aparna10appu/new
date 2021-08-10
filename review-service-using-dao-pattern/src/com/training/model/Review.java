package com.training.model;

import org.bson.types.ObjectId;

public class Review {

	private ObjectId id;
	private String itemReviewed;
	private String reviewAspect;
	private String reviewBody;
	private int reviewRating;
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Review(ObjectId id, String itemReviewed, String reviewAspect, String reviewBody, int reviewRating) {
		super();
		this.id = id;
		this.itemReviewed = itemReviewed;
		this.reviewAspect = reviewAspect;
		this.reviewBody = reviewBody;
		this.reviewRating = reviewRating;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getItemReviewed() {
		return itemReviewed;
	}
	public void setItemReviewed(String itemReviewed) {
		this.itemReviewed = itemReviewed;
	}
	public String getReviewAspect() {
		return reviewAspect;
	}
	public void setReviewAspect(String reviewAspect) {
		this.reviewAspect = reviewAspect;
	}
	public String getReviewBody() {
		return reviewBody;
	}
	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
	}
	public int getReviewRating() {
		return reviewRating;
	}
	public void setReviewRating(int reviewRating) {
		this.reviewRating = reviewRating;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((itemReviewed == null) ? 0 : itemReviewed.hashCode());
		result = prime * result + ((reviewAspect == null) ? 0 : reviewAspect.hashCode());
		result = prime * result + ((reviewBody == null) ? 0 : reviewBody.hashCode());
		result = prime * result + reviewRating;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (itemReviewed == null) {
			if (other.itemReviewed != null)
				return false;
		} else if (!itemReviewed.equals(other.itemReviewed))
			return false;
		if (reviewAspect == null) {
			if (other.reviewAspect != null)
				return false;
		} else if (!reviewAspect.equals(other.reviewAspect))
			return false;
		if (reviewBody == null) {
			if (other.reviewBody != null)
				return false;
		} else if (!reviewBody.equals(other.reviewBody))
			return false;
		if (reviewRating != other.reviewRating)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Review [id=" + id + ", itemReviewed=" + itemReviewed + ", reviewAspect=" + reviewAspect
				+ ", reviewBody=" + reviewBody + ", reviewRating=" + reviewRating + "]";
	}
	
	
	
}
