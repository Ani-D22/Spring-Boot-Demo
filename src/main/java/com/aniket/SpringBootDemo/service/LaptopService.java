package com.aniket.SpringBootDemo.service;

import com.aniket.SpringBootDemo.LaptopRepository;
import com.aniket.SpringBootDemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop laptop) {
        System.out.println("addLaptop method called..!");
        repo.save(laptop);
    }

    public boolean isGoodForProg(){
        return true;
    }

}
