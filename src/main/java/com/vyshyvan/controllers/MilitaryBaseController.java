package com.vyshyvan.controllers;

import com.vyshyvan.model.MilitaryBase;
import com.vyshyvan.services.army.ArmyServiceImpl;
import com.vyshyvan.services.division.DivisionService;
import com.vyshyvan.services.militarybase.MilitaryBaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/militarybase")
public class MilitaryBaseController {
    @Autowired
    MilitaryBaseServiceImpl militaryBaseService;

    @Autowired
    ArmyServiceImpl armyService;
    @RequestMapping("/showall")
    public List<MilitaryBase> showMilitaryBases(){
        return militaryBaseService.getAll();
    }

    @RequestMapping("/create")
    public MilitaryBase create(@RequestBody MilitaryBase militaryBase){
        System.out.println(militaryBase.getArmyId());
        //militaryBase.setArmy(armyService.getArmy(militaryBase.getArmyId()));
       /* if (militaryBase.getDivisionId() != null){
        }*/
        return militaryBaseService.insertMilitaryBase(militaryBase);
    }

    @RequestMapping("/get")
    public MilitaryBase get(@RequestParam("id") int id){
        return militaryBaseService.getMilitaryBase(id);
    }

    @RequestMapping("/delete")
    public void delete(@RequestParam("id") int id){
        militaryBaseService.deleteMilitaryBase(id);
    }
}