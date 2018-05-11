package com.vyshyvan.controllers;

import com.vyshyvan.model.Squadron;
import com.vyshyvan.services.squadron.SquadronServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SquadronController {
    @Autowired
    SquadronServiceImpl squadronService;

    @RequestMapping("/squadron")
    public List<Squadron> showSquadrons(){
        return squadronService.getAll();
    }

}
