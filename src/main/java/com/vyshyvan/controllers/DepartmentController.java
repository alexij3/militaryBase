package com.vyshyvan.controllers;

import com.vyshyvan.model.Department;
import com.vyshyvan.services.department.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentController {
    @Autowired
    DepartmentServiceImpl departmentService;

    @RequestMapping("/department")
    public List<Department> showDepartments(){
        return departmentService.getAll();
    }

}
