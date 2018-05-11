package com.vyshyvan.model;

public class Transport {
    private Integer id;
    private TransportType transportType;
    private String name;
    private int capacity;
    private int fightingSeats;

    public Transport(Integer id, TransportType transportType, String name, int capacity, int fightingSeats) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transport transport = (Transport) o;

        if (capacity != transport.capacity) return false;
        if (fightingSeats != transport.fightingSeats) return false;
        if (id != null ? !id.equals(transport.id) : transport.id != null) return false;
        if (transportType != null ? !transportType.equals(transport.transportType) : transport.transportType != null)
            return false;
        return name != null ? name.equals(transport.name) : transport.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (transportType != null ? transportType.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + capacity;
        result = 31 * result + fightingSeats;
        return result;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "id=" + id +
                ", transportType=" + transportType +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", fightingSeats=" + fightingSeats +
                '}';
    }
}
