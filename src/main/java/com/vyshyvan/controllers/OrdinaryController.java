package com.vyshyvan.controllers;

import com.vyshyvan.model.Ordinary;
import com.vyshyvan.model.Rang;
import com.vyshyvan.model.Soldier;
import com.vyshyvan.services.ordinary.OrdinaryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ordinary")
public class OrdinaryController {
    @Autowired
    OrdinaryServiceImpl ordinaryService;

    @RequestMapping("/showall")
    public List<Ordinary> showOrdinary(){
        return ordinaryService.getAll();
    }

    @RequestMapping("/insert")
    public Ordinary create(@RequestParam("soldierId") int soldierId, Rang rang){
        Soldier soldier = new Soldier();
        soldier.setId(soldierId);

        Ordinary ordinary = new Ordinary(soldier, rang);
        return ordinaryService.insertOrdinary(ordinary);
    }

    @RequestMapping("/update")
    public Ordinary update(@RequestParam("id") int id,
                           @RequestParam("soldierId") int soldierId,
                           @RequestParam("rang") Rang rang){
        Ordinary ordinary = new Ordinary();
        ordinary.setId(id);

        Soldier soldier = new Soldier();
        soldier.setId(soldierId);

        ordinary.setSoldier(soldier);
        ordinary.setRang(rang);

        return ordinaryService.updateOrdinary(ordinary);
    }

    @RequestMapping("/delete")
    public void delete(@RequestParam("id") int id){
        ordinaryService.deleteOrdinary(id);
    }
}
