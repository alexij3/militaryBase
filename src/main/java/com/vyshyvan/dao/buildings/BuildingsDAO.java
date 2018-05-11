package com.vyshyvan.dao.buildings;

import com.vyshyvan.model.Buildings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuildingsDAO extends CrudRepository<Buildings, Integer>{

}
