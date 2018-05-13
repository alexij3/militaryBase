package com.vyshyvan.services.department;

import com.vyshyvan.model.Department;

import java.util.List;

public interface DepartmentService {
    Department insertDepartment(Department department);
    Department getDepartment(int id);
    Department updateDepartment(Department department);
    Department deleteDepartment(int id);
    List<Department> getAll();
}
