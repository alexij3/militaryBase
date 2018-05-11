package com.vyshyvan.dao.transport;

import com.vyshyvan.datastorage.DataStorage;
import com.vyshyvan.model.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TransportDAOImpl implements TransportDAO {
    @Autowired
    DataStorage dataStorage;

    @Override
    public Transport insertTransport(Transport transport) {
        dataStorage.getTransport().add(transport);
        return transport;
    }

    @Override
    public Transport getTransport(int id) {
        return dataStorage.getTransport().stream()
                .filter(el->el.getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public Transport updateTransport(Transport transport) {
        for(Transport a: dataStorage.getTransport())
        {
            if(a.getId() == transport.getId())
            {
                a.setCapacity(transport.getCapacity());
                a.setFightingSeats(transport.getFightingSeats());
                a.setName(transport.getName());
                a.setTransportType(transport.getTransportType());
                break;
            }
        }
        return transport;
    }



    @Override
    public Transport deleteTransport(int id) {
        Transport transport = dataStorage.getTransport()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getTransport().remove(transport);
        return transport;
    }

    @Override
    public List<Transport> getAll() {
        return dataStorage.getTransport();
    }

}
