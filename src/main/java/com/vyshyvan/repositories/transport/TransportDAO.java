package com.vyshyvan.repositories.transport;

import com.vyshyvan.model.Transport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportDAO extends CrudRepository<Transport, Integer>{

}

