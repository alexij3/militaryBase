package com.vyshyvan.repositories.corps;

import com.vyshyvan.model.Corps;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorpsDAO extends CrudRepository<Corps, Integer>{

}

