package com.vyshyvan.repositories.officers;

import com.vyshyvan.model.Officers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficersDAO extends CrudRepository<Officers, Integer>{

}