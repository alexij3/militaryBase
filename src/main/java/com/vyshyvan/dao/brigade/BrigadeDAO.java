package com.vyshyvan.dao.brigade;

import com.vyshyvan.model.Brigade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrigadeDAO extends CrudRepository<Brigade, Integer>{

}
