package com.example.demo2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Stay {
    @Id
    private String hotelName;
    private String hotelAddress;
    private int persons;
    private String date;
}
