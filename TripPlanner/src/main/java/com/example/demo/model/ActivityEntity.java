package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ActivityTable")

public class ActivityEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int activityId;
    private String activityName;
    private String activityLocation;
    private Date activityDate;
    
	public int getActivityId() {
		return activityId;
	}
	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getActivityLocation() {
		return activityLocation;
	}
	public void setActivityLocation(String activityLocation) {
		this.activityLocation = activityLocation;
	}
	public Date getActivityDate() {
		return activityDate;
	}
	public void setActivityDate(Date activityDate) {
		this.activityDate = activityDate;
	}
	public ActivityEntity(int activityId, String activityName, String activityLocation, Date activityDate) {
		super();
		this.activityId = activityId;
		this.activityName = activityName;
		this.activityLocation = activityLocation;
		this.activityDate = activityDate;
	}
	public ActivityEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
}
