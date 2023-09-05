package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.HotelEntity;

public interface HotelRepository extends JpaRepository<HotelEntity,Integer>{

}
