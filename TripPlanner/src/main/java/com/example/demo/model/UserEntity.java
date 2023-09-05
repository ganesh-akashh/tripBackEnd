package com.example.demo.model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="UserTable")
public class UserEntity {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int userId;
   private String userName;
   private String email;
   private String  password;
   
   @OneToOne(cascade=CascadeType.ALL)
   @JoinColumn(name="fk_trip_id")
   private TripEntity te;

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public TripEntity getTe() {
	return te;
}

public void setTe(TripEntity te) {
	this.te = te;
}

public UserEntity(int userId, String userName, String email, String password, TripEntity te) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.email = email;
	this.password = password;
	this.te = te;
}

public UserEntity() {
	super();
	// TODO Auto-generated constructor stub
}


   
   

}
