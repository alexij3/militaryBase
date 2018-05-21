package com.vyshyvan.repositories.soldier;

import com.vyshyvan.model.Soldier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoldierDAO extends JpaRepository<Soldier, Integer> {

}

