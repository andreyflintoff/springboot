package com.example.demo2.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Stay {
    @Id
    private int hotelId;
    
    private String hotelName;
    private String hotelAddress;
    private int no_of_rooms;
    private int no_of_person;
    private int no_of_day;
    private String date;
    public int getHotelId() {
        return hotelId;
    }
    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }
    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public String getHotelAddress() {
        return hotelAddress;
    }
    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
    public int getNo_of_rooms() {
        return no_of_rooms;
    }
    public void setNo_of_rooms(int no_of_rooms) {
        this.no_of_rooms = no_of_rooms;
    }
    public int getNo_of_person() {
        return no_of_person;
    }
    public void setNo_of_person(int no_of_person) {
        this.no_of_person = no_of_person;
    }
    public int getNo_of_day() {
        return no_of_day;
    }
    public void setNo_of_day(int no_of_day) {
        this.no_of_day = no_of_day;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Stay(int hotelId, String hotelName, String hotelAddress, int no_of_rooms, int no_of_person, int no_of_day,
            String date) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
        this.no_of_rooms = no_of_rooms;
        this.no_of_person = no_of_person;
        this.no_of_day = no_of_day;
        this.date = date;
    }
    public Stay() {
    }
    @OneToOne(mappedBy = "product",cascade = CascadeType.ALL)
    @JoinColumn(name="fk_add_id")
    @JsonManagedReference
    Payment payment;//obj of secondary table
    public Payment getPayment() {
        return payment;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    
    
}
