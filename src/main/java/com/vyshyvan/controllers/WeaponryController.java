package com.vyshyvan.controllers;

import com.vyshyvan.model.Weaponry;
import com.vyshyvan.services.weaponry.WeaponryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WeaponryController {
    @Autowired
    WeaponryServiceImpl weaponryService;

    @RequestMapping("/weaponry")
    public List<Weaponry> showWeaponry(){
        return weaponryService.getAll();
    }

}
