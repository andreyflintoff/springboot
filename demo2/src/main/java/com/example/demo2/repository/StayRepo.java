package com.example.demo2.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.model.Stay;

public interface StayRepo extends JpaRepository<Stay,Integer>{
    
}
