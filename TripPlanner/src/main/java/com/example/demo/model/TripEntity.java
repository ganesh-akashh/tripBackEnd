package com.example.demo.model;

import java.sql.Date;
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
@Table(name="TripTable")
public class TripEntity {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tripId;
	private String destination;
	private Date startDate;
	private Date endDate;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_activity_id")
	private List<ActivityEntity> ae;

	public TripEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TripEntity(int tripId, String destination, Date startDate, Date endDate, List<ActivityEntity> ae) {
		super();
		this.tripId = tripId;
		this.destination = destination;
		this.startDate = startDate;
		this.endDate = endDate;
		this.ae = ae;
	}

	public int getTripId() {
		return tripId;
	}

	public void setTripId(int tripId) {
		this.tripId = tripId;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<ActivityEntity> getAe() {
		return ae;
	}

	public void setAe(List<ActivityEntity> ae) {
		this.ae = ae;
	}
	
	
	
	
	
	
}
