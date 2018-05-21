package com.vyshyvan.repositories.transportinmilitarybase;

import com.vyshyvan.model.TransportInMilitaryBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportInMilitaryBaseDAO extends JpaRepository<TransportInMilitaryBase, Integer> {

}

