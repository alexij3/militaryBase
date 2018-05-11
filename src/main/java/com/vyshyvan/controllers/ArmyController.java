package com.vyshyvan.controllers;

import com.vyshyvan.model.Army;
import com.vyshyvan.services.army.ArmyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ArmyController {
    @Autowired
    ArmyServiceImpl armyService;

    @RequestMapping("/army")
    public List<Army> showArmies(){
        return armyService.getAll();
    }

}
