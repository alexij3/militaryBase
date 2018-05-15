package com.vyshyvan.controllers;

import com.vyshyvan.model.MilitaryBase;
import com.vyshyvan.services.militarybase.MilitaryBaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/militarybase")
public class MilitaryBaseController {
    @Autowired
    MilitaryBaseServiceImpl militaryBaseService;

    @RequestMapping("/showall")
    public List<MilitaryBase> showMilitaryBases(){
        return militaryBaseService.getAll();
    }

    @RequestMapping("/create")
    public MilitaryBase create(@RequestBody MilitaryBase militaryBase){
        return militaryBaseService.insertMilitaryBase(militaryBase);
    }
}