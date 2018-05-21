package com.vyshyvan.controllers;

import com.vyshyvan.model.Officers;
import com.vyshyvan.model.Rang;
import com.vyshyvan.model.Soldier;
import com.vyshyvan.services.officers.OfficersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/officers")
public class OfficersController {
    @Autowired
    OfficersServiceImpl officersService;

    @RequestMapping("/showall")
    public List<Officers> showOfficers(){
        return officersService.getAll();
    }

    @RequestMapping("/insert")
    public Officers create(@RequestParam("soldierId") int soldierId,
                           @RequestBody Officers officers){
        Soldier soldier = new Soldier();
        soldier.setId(soldierId);

        officers.setSoldier(soldier);
        return officersService.insertOfficers(officers);
    }

    @RequestMapping("/update")
    public Officers update(@RequestParam("id") int id,
                           @RequestParam("soldierId") int soldierId,
                           @RequestBody Officers officers){
        Officers officers1 = new Officers();
        officers1.setId(id);
        officers1.setRang(officers.getRang());
        officers1.setAcademyGraduation(officers.getAcademyGraduation());
        officers1.setBecameGeneral(officers.getBecameGeneral());


        Soldier soldier = new Soldier();
        soldier.setId(soldierId);

        officers1.setSoldier(soldier);


        return officersService.updateOfficers(officers1);
    }

    @RequestMapping("/delete")
    public void delete(@RequestParam("id") int id){
        officersService.deleteOfficers(id);
    }

}
