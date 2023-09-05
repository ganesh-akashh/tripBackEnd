package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EatEntity;
import com.example.demo.service.EatServices;

@CrossOrigin
@RestController
public class EatController {
    @Autowired
    EatServices es;
    
    @GetMapping("showEatDetails")
    public List<EatEntity> showEatDetails(){
    	return es.showEatInfo();
    }
    
    @PostMapping("addEatDetails")
    public EatEntity addEatDetails(@RequestBody EatEntity ee) {
    	return es.saveEatInfo(ee);
    }
    
 
}
