package com.vyshyvan.repositories.ordinary;

import com.vyshyvan.model.Ordinary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdinaryDAO extends CrudRepository<Ordinary, Integer>{

}

