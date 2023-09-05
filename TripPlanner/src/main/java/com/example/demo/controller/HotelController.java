package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.HotelEntity;

import com.example.demo.service.HotelServices;

@CrossOrigin
@RestController
public class HotelController {
   
	@Autowired
	HotelServices hs;
	
	@GetMapping("showHotelDetails")
	public List<HotelEntity> showHotelDetail(){
		return hs.showHotelInfo();
	}
	@PostMapping("addHotelDetails")
	public HotelEntity addHotelDetails(@RequestBody HotelEntity he) {
		return hs.saveHotelInfo(he);
	}

	@GetMapping("hotelPaging/{pageno}/{pagesize}")
	public List<HotelEntity> showHotelInfo(@PathVariable int pageno,@PathVariable int pagesize){
		return hs.getHotelByPage(pageno, pagesize);
	}
	

}
