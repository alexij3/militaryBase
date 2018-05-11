package com.vyshyvan.controllers;

import com.vyshyvan.model.Officers;
import com.vyshyvan.services.officers.OfficersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OfficersController {
    @Autowired
    OfficersServiceImpl officersService;

    @RequestMapping("/officers")
    public List<Officers> showOfficers(){
        return officersService.getAll();
    }

}
