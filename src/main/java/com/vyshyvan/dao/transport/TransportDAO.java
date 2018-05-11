package com.vyshyvan.dao.transport;

import com.vyshyvan.model.Transport;

import java.util.List;

public interface TransportDAO {
    Transport insertTransport(Transport transport);
    Transport getTransport(int id);
    Transport updateTransport(Transport transport);
    Transport deleteTransport(int id);
    List<Transport> getAll();
}
