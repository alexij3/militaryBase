package com.vyshyvan.repositories.ordinary;

import com.vyshyvan.model.Ordinary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdinaryDAO extends JpaRepository<Ordinary, Integer> {

}
