package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="RestaurantsTable")
public class EatEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int resId;
    private String resImage;
    private String resName;
    private int rating;
    private String noOfReviews;
    

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_resReviewId")
	public List<ReviewEntity> review;


	public int getResId() {
		return resId;
	}


	public void setResId(int resId) {
		this.resId = resId;
	}


	public String getResImage() {
		return resImage;
	}


	public void setResImage(String resImage) {
		this.resImage = resImage;
	}


	public String getResName() {
		return resName;
	}


	public void setResName(String resName) {
		this.resName = resName;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public String getNoOfReviews() {
		return noOfReviews;
	}


	public void setNoOfReviews(String noOfReviews) {
		this.noOfReviews = noOfReviews;
	}


	public List<ReviewEntity> getReview() {
		return review;
	}


	public void setReview(List<ReviewEntity> review) {
		this.review = review;
	}


	public EatEntity(int resId, String resImage, String resName, int rating, String noOfReviews,
			List<ReviewEntity> review) {
		super();
		this.resId = resId;
		this.resImage = resImage;
		this.resName = resName;
		this.rating = rating;
		this.noOfReviews = noOfReviews;
		this.review = review;
	}


	public EatEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
