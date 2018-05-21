package com.vyshyvan.repositories.division;

import com.vyshyvan.model.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionDAO extends JpaRepository<Division, Integer> {

}

