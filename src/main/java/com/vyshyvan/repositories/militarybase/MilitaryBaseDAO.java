package com.vyshyvan.repositories.militarybase;

import com.vyshyvan.model.MilitaryBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MilitaryBaseDAO extends JpaRepository<MilitaryBase, Integer> {

}

