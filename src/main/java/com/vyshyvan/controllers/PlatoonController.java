package com.vyshyvan.controllers;

import com.vyshyvan.model.Platoon;
import com.vyshyvan.services.platoon.PlatoonServiceImpl;
import com.vyshyvan.services.squadron.SquadronServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/platoon")
public class PlatoonController {
    @Autowired
    PlatoonServiceImpl platoonService;

    @Autowired
    SquadronServiceImpl squadronService;

    @RequestMapping("/showall")
    public List<Platoon> showPlatoons(){
        return platoonService.getAll();
    }

    @RequestMapping("/create")
    public Platoon create(@RequestBody Platoon platoon) {
        platoon.setSquadron(squadronService.getSquadron(platoon.getSquadronId()));
        return platoonService.insertPlatoon(platoon);
    }

    @RequestMapping("/update")
    public Platoon updatePlatoon(@RequestParam("id") Integer id, @RequestBody Platoon platoon) {
        platoon.setId(id);
        platoon.setSquadron(squadronService.getSquadron(platoon.getSquadronId()));
        return platoonService.updatePlatoon(platoon);
    }

    @RequestMapping("/delete")
    public void deletePlatoon(@RequestParam("id") int id){
        platoonService.deletePlatoon(id);
    }

    @RequestMapping("/get")
    public Platoon get(@RequestParam("id") int id){
        return platoonService.getPlatoon(id);
    }

}
