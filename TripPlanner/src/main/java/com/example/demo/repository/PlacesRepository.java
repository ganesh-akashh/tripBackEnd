package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PlacesEntity;

public interface PlacesRepository extends JpaRepository<PlacesEntity,Integer>{

}
