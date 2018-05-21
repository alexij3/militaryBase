package com.vyshyvan.repositories.corps;

import com.vyshyvan.model.Corps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorpsDAO extends JpaRepository<Corps, Integer> {

}

