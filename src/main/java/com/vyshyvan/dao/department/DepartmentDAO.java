package com.vyshyvan.dao.department;

import com.vyshyvan.model.Department;

import java.util.List;

public interface DepartmentDAO {
    Department insertDepartment(Department department);
    Department getDepartment(int id);
    Department updateDepartment(Department department);
    Department deleteDepartment(int id);
    List<Department> getAll();
}
