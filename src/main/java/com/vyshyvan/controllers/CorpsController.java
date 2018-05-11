package com.vyshyvan.controllers;


import com.vyshyvan.model.Corps;
import com.vyshyvan.services.corps.CorpsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CorpsController {
    @Autowired
    CorpsServiceImpl corpsService;

    @RequestMapping("/corps")
    public List<Corps> showCorps(){
        return corpsService.getAll();
    }
}
