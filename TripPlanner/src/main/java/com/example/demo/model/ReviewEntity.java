package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="reviewTable")
public class ReviewEntity {
   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int reviewId;
	private String reviewName;
	
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public String getReviewName() {
		return reviewName;
	}
	public void setReviewName(String reviewName) {
		this.reviewName = reviewName;
	}
	public ReviewEntity(int reviewId, String reviewName) {
		super();
		this.reviewId = reviewId;
		this.reviewName = reviewName;
	}
	public ReviewEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
