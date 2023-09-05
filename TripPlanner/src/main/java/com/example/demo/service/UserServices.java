package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserEntity;
import com.example.demo.repository.UserRepository;

@Service
public class UserServices {
    
	@Autowired
	UserRepository ur;
	

	public List<UserEntity> showInfo(){
		return ur.findAll();
	}
	
	public UserEntity saveInfo(UserEntity ue) {
		return ur.save(ue);
	}
	
	
		public UserEntity addTripDetails(UserEntity ue) {
			return ur.save(ue);
		}
	
		
	public Optional<UserEntity> showInfoById(int id) {
		return ur.findById(id);
	}
	
	public void deleteInfo(UserEntity ue) {
		ur.delete(ue);
	}
	
	public void deleteInfoById(int id) {
		ur.deleteById(id);
	}
	
	public UserEntity updateInfo(UserEntity ue) {
		return ur.saveAndFlush(ue);
	}
	 
	//Sorting in Ascending order.
	public List<UserEntity> sortinfo(String s){
		return ur.findAll(Sort.by(Sort.Direction.ASC,s));
	}
	
	
	//Pagination.
	public List<UserEntity> getByPage(int pgno,int pgisze){
		Page<UserEntity> p=ur.findAll(PageRequest.of(pgno, pgisze,Sort.by("userName")));
	    return p.getContent();
	}
	
	 //SelecetQuery
	public List<UserEntity> getDetails(int s,String b){
			return ur.getUserDetails(s,b);
	}
	
	//UpdateQuery
	public int updateById(int newId,int oldId) {
		return ur.updateUserId(newId, oldId);
	}
	
	//DeleteQuery
	public int deleteByEmail(String userEmail) {
		return ur.deleteUserInfo(userEmail);
	}
	
	//emailValidation
	public int checkEmail(String inputEmail) {
		return ur.checkEmailExists(inputEmail);
	}
	
	//formValidation
	public String checkForm(String inputEmail,String inputPassword) {
		return ur.checkForm(inputEmail, inputPassword);
	}
}
	
	
