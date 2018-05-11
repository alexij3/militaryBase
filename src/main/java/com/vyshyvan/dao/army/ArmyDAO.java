package com.vyshyvan.dao.army;

import com.vyshyvan.model.Army;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArmyDAO extends CrudRepository<Army, Integer>{

}
