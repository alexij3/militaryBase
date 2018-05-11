package com.vyshyvan.controllers;

import com.vyshyvan.model.MilitaryBase;
import com.vyshyvan.services.militarybase.MilitaryBaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MilitaryBaseController {
    @Autowired
    MilitaryBaseServiceImpl militaryBaseService;

    @RequestMapping("/militarybase")
    public List<MilitaryBase> showMilitaryBases(){
        return militaryBaseService.getAll();
    }
}
