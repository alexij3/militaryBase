package com.vyshyvan.model;

import javax.persistence.*;

@Entity
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "transport_type")
    private TransportType transportType;

    @Column
    private String name;

    @Column
    private int capacity;

    @Column(name = "fightings_seats")
    private int fightingSeats;

    public Transport() {
    }

    public Transport(TransportType transportType, String name, int capacity, int fightingSeats) {
        this.transportType = transportType;
        this.name = name;
        this.capacity = capacity;
        this.fightingSeats = fightingSeats;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFightingSeats() {
        return fightingSeats;
    }

    public void setFightingSeats(int fightingSeats) {
        this.fightingSeats = fightingSeats;
    }
}
