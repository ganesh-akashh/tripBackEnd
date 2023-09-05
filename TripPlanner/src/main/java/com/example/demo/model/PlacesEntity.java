package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PlacesEntity")
public class PlacesEntity {
   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int placesId;
	private String placeName;
	private String imgUrl;
	private int rating;
	private int noOfReviews;
	private String pricing;
	
	
	
	public int getPlacesId() {
		return placesId;
	}
	public void setPlacesId(int placesId) {
		this.placesId = placesId;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getNoOfReviews() {
		return noOfReviews;
	}
	public void setNoOfReviews(int noOfReviews) {
		this.noOfReviews = noOfReviews;
	}
	public String getPricing() {
		return pricing;
	}
	public void setPricing(String pricing) {
		this.pricing = pricing;
	}
	public PlacesEntity(int placesId, String placeName, String imgUrl, int rating, int noOfReviews, String pricing) {
		super();
		this.placesId = placesId;
		this.placeName = placeName;
		this.imgUrl = imgUrl;
		this.rating = rating;
		this.noOfReviews = noOfReviews;
		this.pricing = pricing;
	}
	public PlacesEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
