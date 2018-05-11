package com.vyshyvan.dao.department;

import com.vyshyvan.datastorage.DataStorage;
import com.vyshyvan.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartmentDAOImpl implements DepartmentDAO {
    @Autowired
    DataStorage dataStorage;

    @Override
    public Department insertDepartment(Department department) {
        dataStorage.getDepartments().add(department);
        return department;
    }

    @Override
    public Department getDepartment(int id) {
        return dataStorage.getDepartments().stream()
                .filter(el->el.getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public Department updateDepartment(Department department) {
        for(Department a: dataStorage.getDepartments())
        {
            if(a.getId() == department.getId())
            {
                a.setCodeNumber(department.getCodeNumber());
                a.setName(department.getName());
                a.setCaptain(department.getCaptain());
                a.setPlatoon(department.getPlatoon());
                break;
            }
        }
        return department;
    }



    @Override
    public Department deleteDepartment(int id) {
        Department department = dataStorage.getDepartments()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getDepartments().remove(department);
        return department;
    }

    @Override
    public List<Department> getAll() {
        return dataStorage.getDepartments();
    }
}
