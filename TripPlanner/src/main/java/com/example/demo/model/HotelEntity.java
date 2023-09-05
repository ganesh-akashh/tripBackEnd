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
@Table(name="HotelTable")
public class HotelEntity {
  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int hotelId;
	private String hotelImage;
	private String hotelName;
	private int rating;
	private String noOfreviews;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_hotelReviewID")
	private List<ReviewEntity> review;

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelImage() {
		return hotelImage;
	}

	public void setHotelImage(String hotelImage) {
		this.hotelImage = hotelImage;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getNoOfreviews() {
		return noOfreviews;
	}

	public void setNoOfreviews(String noOfreviews) {
		this.noOfreviews = noOfreviews;
	}

	public List<ReviewEntity> getReview() {
		return review;
	}

	public void setReview(List<ReviewEntity> review) {
		this.review = review;
	}

	public HotelEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HotelEntity(int hotelId, String hotelImage, String hotelName, int rating, String noOfreviews,
			List<ReviewEntity> review) {
		super();
		this.hotelId = hotelId;
		this.hotelImage = hotelImage;
		this.hotelName = hotelName;
		this.rating = rating;
		this.noOfreviews = noOfreviews;
		this.review = review;
	}

	
	
}
