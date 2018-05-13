package com.vyshyvan.repositories.division;

import com.vyshyvan.model.Division;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionDAO extends CrudRepository<Division, Integer>{

}

