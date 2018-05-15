package com.vyshyvan.controllers;

import com.vyshyvan.model.Squadron;
import com.vyshyvan.services.squadron.SquadronServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/squadron")
public class SquadronController {
    @Autowired
    SquadronServiceImpl squadronService;

    @RequestMapping("/showall")
    public List<Squadron> showSquadrons(){
        return squadronService.getAll();
    }

    @RequestMapping("/create")
    public Squadron create(@RequestBody Squadron squadron) {
        return squadronService.insertSquadron(squadron);
    }

    @RequestMapping("/update")
    public Squadron updateSquadron(@RequestParam("id") Integer id, @RequestBody Squadron squadron) {
        squadron.setId(id);
        return squadronService.updateSquadron(squadron);
    }

    @RequestMapping("/delete")
    public void deleteSquadron(@RequestParam("id") int id){
        squadronService.deleteSquadron(id);
    }

    @RequestMapping("/get")
    public Squadron get(@RequestParam("id") int id){
        return squadronService.getSquadron(id);
    }

}

