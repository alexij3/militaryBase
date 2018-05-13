package com.vyshyvan.repositories.buildings;

import com.vyshyvan.model.Buildings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingsDAO extends CrudRepository<Buildings, Integer>{

}