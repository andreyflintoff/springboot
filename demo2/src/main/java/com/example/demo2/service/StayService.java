package com.example.demo2.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.model.Stay;
import com.example.demo2.repository.StayRepo;
@Service
public class StayService {
    @Autowired
    StayRepo mr;
    public Stay create (Stay mm)
    {
        return mr.save(mm);
    }
    public List<Stay> getAll()
    {
        return mr.findAll();
    }
    public Stay getMe(int id)
    {
        return mr.findById(id).orElse(null);
    }
    public boolean updateDetails(int id,Stay mm)
        {
            if(this.getMe(id)==null)
            {
                return false;
            }
            try{
                mr.save(mm);
            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }
public boolean deleteMedicine(int id)
        {
            if(this.getMe(id) == null)
            {
                return false;
            }
            mr.deleteById(id);
            return true;
        }

}
