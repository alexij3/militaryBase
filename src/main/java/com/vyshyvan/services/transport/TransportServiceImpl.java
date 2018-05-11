package com.vyshyvan.services.transport;

import com.vyshyvan.dao.transport.TransportDAOImpl;
import com.vyshyvan.model.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportServiceImpl implements TransportService {
    @Autowired
    TransportDAOImpl transportDAO;

    @Override
    public Transport insertTransport(Transport transport) {
        return transportDAO.insertTransport(transport);
    }

    @Override
    public Transport getTransport(int id) {
        return transportDAO.getTransport(id);
    }

    @Override
    public Transport updateTransport(Transport transport) {
        return transportDAO.updateTransport(transport);
    }

    @Override
    public Transport deleteTransport(int id) {
        return transportDAO.deleteTransport(id);
    }

    @Override
    public List<Transport> getAll() {
        return transportDAO.getAll();
    }
}
