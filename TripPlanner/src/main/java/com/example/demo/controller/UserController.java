package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserEntity;
import com.example.demo.service.UserServices;

@CrossOrigin
@RestController
public class UserController {
   
	@Autowired
	UserServices us;
	
	//getRequest.
	@GetMapping("showUserDetails")
	public List<UserEntity> showUserDetails(){
		return us.showInfo();
	}
	

	//PostRequest
	@PostMapping("addUserDetail")
	public UserEntity addUserDetail(@RequestBody UserEntity ue) {
		return us.saveInfo(ue);
	}
	
	//GetById.
	@GetMapping("showUserDetailById/{id}")
	public Optional<UserEntity> showUserDetail(@PathVariable int id) {
		return us.showInfoById(id);
	}
	
	//DeleteRequest
	@DeleteMapping("deleteUserInfo")
	public String deleteUserInfo( @RequestBody UserEntity ue) {
	    us.deleteInfo(ue);
	    return "Deleted";
	}
	
	//DeleteBYiD.
	@DeleteMapping("deleteInfo/{id}")
	public String deleteUserInfoById(@PathVariable int id) {
		us.deleteInfoById(id);
		return "Succesfully Deleted";
	}
	

	//Sorting.
	@GetMapping("sort/{userName}")
	public List<UserEntity> getSortInfo(@PathVariable String userName){
		return us.sortinfo(userName);
	}
	
	//Pagination.
	@GetMapping("paging/{pageno}/{pagesize}")
	public List<UserEntity> showPageInfo(@PathVariable int pageno,@PathVariable int pagesize){
		  return us.getByPage(pageno, pagesize);
	}
		
	@PostMapping("addTripDetails")
	public UserEntity addTripDetails(@RequestBody UserEntity ue) {
		return us.saveInfo(ue);
	}
	
	//SelectQuery
	@GetMapping("/getUserInfo/{id}/{userName}")
	public List<UserEntity> getUserInfo(@PathVariable int id,@PathVariable String userName){
		return us.getDetails(id, userName);
	}
	
	//UpdateQuery
	@PutMapping("updateUserId/{newid}/{oldid}")
	public int updateUserId(@PathVariable int newid,@PathVariable int oldid) {
		return us.updateById(newid, oldid);
	}
	
	@DeleteMapping("deleteUserName/{userEmail}")
	public int deleteUserId(@PathVariable String userEmail) {
		return us.deleteByEmail(userEmail);
	}
	
	@GetMapping("checkEmailExists/{userEmail}")
	public int checkEmailExists(@PathVariable String userEmail){
		return us.checkEmail(userEmail);
	}
	
	@GetMapping("checkForm/{inputEmail}/{inputPassword}")
	public String checkForm(@PathVariable String inputEmail,@PathVariable String inputPassword) {
		return us.checkForm(inputEmail, inputPassword);
	}
	
	
}
