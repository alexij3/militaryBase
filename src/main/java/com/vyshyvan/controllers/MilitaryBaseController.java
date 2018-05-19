package com.vyshyvan.controllers;

import com.vyshyvan.model.*;
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
    public MilitaryBase create(int armyId, int divisionId, int corpsId, int brigadeId, int captainId){
        Army army = new Army();
        Division division = new Division();
        Corps corps = new Corps();
        Brigade brigade = new Brigade();
        Soldier soldier = new Soldier();

        army.setId(armyId);
        /*division.setId(divisionId);
        corps.setId(corpsId);
        brigade.setId(brigadeId);
        soldier.setId(captainId);*/

        MilitaryBase militaryBase = new MilitaryBase("somename", army, null, null, null, null);

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