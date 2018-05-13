package com.vyshyvan.repositories.army;

import com.vyshyvan.model.Army;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmyDAO extends CrudRepository<Army, Integer>{

}
