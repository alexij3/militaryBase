package com.vyshyvan.repositories.department;

import com.vyshyvan.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentDAO extends CrudRepository<Department, Integer>{

}

