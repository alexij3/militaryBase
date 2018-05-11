package com.vyshyvan.controllers;

import com.vyshyvan.model.Soldier;
import com.vyshyvan.services.soldier.SoldierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SoldierController {
    @Autowired
    SoldierServiceImpl soldierService;

    @RequestMapping("/soldier")
    public List<Soldier> showSoldiers(){
        return soldierService.getAll();
    }

}
