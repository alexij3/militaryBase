package com.vyshyvan.repositories.transportinmilitarybase;

import com.vyshyvan.model.TransportInMilitaryBase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportInMilitaryBaseDAO extends CrudRepository<TransportInMilitaryBase, Integer>{

}

