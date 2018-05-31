package com.vyshyvan.repositories.officers;

import com.vyshyvan.model.Officers;
import com.vyshyvan.model.Rang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfficersDAO extends JpaRepository<Officers, Integer> {
    List<Officers> findAllByRang(@Param("rang") Rang rang);
}
