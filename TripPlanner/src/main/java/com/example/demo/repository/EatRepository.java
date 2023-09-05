package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.EatEntity;

public interface EatRepository extends JpaRepository<EatEntity,Integer>{

}
