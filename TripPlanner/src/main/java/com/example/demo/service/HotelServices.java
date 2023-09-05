package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.stereotype.Service;

import com.example.demo.model.HotelEntity;

import com.example.demo.repository.HotelRepository;

@Service
public class HotelServices {

   @Autowired
   HotelRepository hr;
   
   
   public List<HotelEntity> showHotelInfo(){
	   return hr.findAll();
   }
   
   public HotelEntity saveHotelInfo(HotelEntity he) {
	   return hr.save(he);
   }

   public List<HotelEntity> getHotelByPage(int pgno,int pgsize){
	   Page<HotelEntity>p=hr.findAll(PageRequest.of(pgno, pgsize));
	   return p.getContent();
   }
}
