package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


import com.example.demo.model.PlacesEntity;
import com.example.demo.repository.PlacesRepository;

@Service
public class PlaceServices {
   
	@Autowired
	PlacesRepository pr;
	
	public List<PlacesEntity> showPlaceInfo(){
		return pr.findAll();
	}
	
	public PlacesEntity savePlaceInfo(PlacesEntity pe) {
		return pr.save(pe);
	}
	
	 public List<PlacesEntity> getPlaceByPage(int pgno,int pgsize){
		   Page<PlacesEntity>p=pr.findAll(PageRequest.of(pgno, pgsize));
		   return p.getContent();
	   }
}
