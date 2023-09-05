package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PlacesEntity;
import com.example.demo.service.PlaceServices;

@RestController
@CrossOrigin
public class PlacesController {
   
	@Autowired
	PlaceServices ps;
	
	
	@GetMapping("showPlaceDetails")
	public List<PlacesEntity> showPlaceDetails(){
	    return ps.showPlaceInfo();	
	}
	
	@PostMapping("addPlacesDetails")
	public PlacesEntity addPlacesDetails(@RequestBody PlacesEntity pe) {
		 return ps.savePlaceInfo(pe);
	}
	
	@GetMapping("placesPaging/{pageno}/{pagesize}")
	public List<PlacesEntity> showPlaceInfo(@PathVariable int pageno,@PathVariable int pagesize){
		return ps.getPlaceByPage(pageno, pagesize);
	}
}
