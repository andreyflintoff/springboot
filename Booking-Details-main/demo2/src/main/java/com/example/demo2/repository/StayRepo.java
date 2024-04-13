package com.example.demo2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo2.model.Stay;

public interface StayRepo extends JpaRepository<Stay,Integer>{
    @Query("SELECT p FROM Stay p WHERE p.hotelId = :hotelId")
Stay findByName(@RequestParam("hotelId")Integer hotelId);
}
