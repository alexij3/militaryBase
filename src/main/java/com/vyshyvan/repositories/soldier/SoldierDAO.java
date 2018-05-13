package com.vyshyvan.repositories.soldier;

import com.vyshyvan.model.Soldier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoldierDAO extends CrudRepository<Soldier, Integer>{

}

