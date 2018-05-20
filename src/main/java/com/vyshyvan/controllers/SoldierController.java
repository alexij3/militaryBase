package com.vyshyvan.controllers;

import com.vyshyvan.model.MilitaryBase;
import com.vyshyvan.model.Ordinary;
import com.vyshyvan.model.Rang;
import com.vyshyvan.model.Soldier;
import com.vyshyvan.services.militarybase.MilitaryBaseService;
import com.vyshyvan.services.militarybase.MilitaryBaseServiceImpl;
import com.vyshyvan.services.soldier.SoldierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/soldier")
public class SoldierController {
    @Autowired
    SoldierServiceImpl soldierService;

    @Autowired
    MilitaryBaseServiceImpl militaryBaseService;

    @RequestMapping("/showall")
    public List<Soldier> showSoldiers(){
        return soldierService.getAll();
    }

    @RequestMapping("/create")
    public Soldier create(@RequestParam("mbaseId") int mbaseId, @RequestBody Soldier soldier) {
        MilitaryBase militaryBase = new MilitaryBase();
        militaryBase.setId(mbaseId);
        soldier.setMilitaryBase(militaryBase);
        return soldierService.insertSoldier(soldier);
    }

    @RequestMapping("/update")
    public Soldier updateSoldier(@RequestParam("id") Integer id,
                                 @RequestParam("mbaseId") int mbaseId,
                                 @RequestBody Soldier soldier) {
        MilitaryBase militaryBase = new MilitaryBase();
        militaryBase.setId(mbaseId);

        soldier.setMilitaryBase(militaryBase);
        soldier.setId(id);
        return soldierService.updateSoldier(soldier);
    }

    @RequestMapping("/delete")
    public void deleteSoldier(@RequestParam("id") int id){
        soldierService.deleteSoldier(id);
    }

    @RequestMapping("/get")
    public Soldier get(@RequestParam("id") int id){
        return soldierService.getSoldier(id);
    }

    @RequestMapping("/updatespecialties")
    public void updateSpecialties(@RequestParam("id") int id, @RequestBody Soldier soldier){
        soldier.setId(id);
        soldierService.updateSpecialties(soldier);
    }

    @RequestMapping("/deletespecialties")
    public void deleteSpecialties(@RequestParam("soldierId") int id, @RequestBody Soldier soldier){
        soldier.setId(id);
        soldierService.deleteSpecialties(soldier);
    }
}
