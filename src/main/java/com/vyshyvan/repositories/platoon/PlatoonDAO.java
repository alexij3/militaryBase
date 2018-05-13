package com.vyshyvan.repositories.platoon;

import com.vyshyvan.model.Platoon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatoonDAO extends CrudRepository<Platoon, Integer>{

}
