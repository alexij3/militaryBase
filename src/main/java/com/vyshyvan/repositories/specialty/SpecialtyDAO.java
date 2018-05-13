package com.vyshyvan.repositories.specialty;

import com.vyshyvan.model.Specialty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialtyDAO extends CrudRepository<Specialty, Integer>{

}

