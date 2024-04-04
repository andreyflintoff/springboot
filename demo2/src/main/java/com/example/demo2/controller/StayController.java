package com.example.demo2.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.model.Stay;
import com.example.demo2.service.StayService;


@RestController
public class StayController {
    @Autowired
    StayService ms;
    @PostMapping("/api/stay")
    public ResponseEntity<Stay>addelements(@RequestBody Stay m)
    {
        Stay mm=ms.create(m);
        return new ResponseEntity<>(mm,HttpStatus.CREATED);
    }
    @GetMapping("/api/Stays")
    public ResponseEntity<List<Stay>> showinfo()
    {
        return new ResponseEntity<>(ms.getAll(),HttpStatus.OK);
    }
    @GetMapping("/api/Stay/{HotelId}")
    public ResponseEntity<Stay> getById(@PathVariable Integer HotelId)
    {
        Stay obj=ms.getMe(HotelId);
        return new ResponseEntity<>(obj,HttpStatus.OK);
    }
    @PutMapping("/api/Stay/{HotelId}")
    public ResponseEntity<Stay> putMethodName(@PathVariable("HotelId") int id, @RequestBody Stay m) {
        if(ms.updateDetails(id,m) == true)
        {
            return new ResponseEntity<>(m,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
@DeleteMapping("/api/Stay/{HotelId}")
    public ResponseEntity<Boolean> delete(@PathVariable("HotelId") int id)
    {
        if(ms.deleteMedicine(id) == true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }
}