package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.UserEntity;

import jakarta.transaction.Transactional;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{
   
	//Select Query.
	@Query(value="select * from user_table where user_id=:s or user_name=:sn", nativeQuery=true)
public List<UserEntity> getUserDetails(@Param("s") int user_id, @Param("sn") String user_name);
	
    //UpdateQuery.
	@Modifying
	@Transactional
	@Query(value="UPDATE user_table SET user_id=:newid WHERE user_id=:oldid" ,nativeQuery=true)
	public int updateUserId(@Param("newid") int newid,@Param("oldid")int oldid);

    //DeleteQuery
	@Modifying
	@Transactional
	@Query(value="delete from user_table where email=:userEmail",nativeQuery = true)
	public int deleteUserInfo(@Param("userEmail")String userName);
	
	
	@Query(value="select count(*) from user_table where email=:inputEmail ",nativeQuery=true)
	public int checkEmailExists(@Param("inputEmail")String inputEmail);
	
	@Query(value="select user_name from user_table where email=:inputEmail AND password=:inputPassword",nativeQuery=true)
	public String checkForm(@Param("inputEmail")String inputEmail,@Param("inputPassword")String password);
}
