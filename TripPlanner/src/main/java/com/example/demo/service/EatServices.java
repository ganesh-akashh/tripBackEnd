package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EatEntity;

import com.example.demo.repository.EatRepository;

@Service
public class EatServices {
     @Autowired
     EatRepository er;
     
     public List<EatEntity> showEatInfo(){
    	 return er.findAll();
     }
     
     public EatEntity saveEatInfo(EatEntity ee) {
    	 return er.save(ee);
     }
}
