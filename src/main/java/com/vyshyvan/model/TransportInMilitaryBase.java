package com.vyshyvan.model;

public class TransportInMilitaryBase {
    private MilitaryBase militaryBase;
    private Transport transport;
    private int amount;

    public TransportInMilitaryBase(MilitaryBase militaryBase, Transport transport, int amount) {
        this.militaryBase = militaryBase;
        this.transport = transport;
        this.amount = amount;
    }

    public MilitaryBase getMilitaryBase() {
        return militaryBase;
    }

    public void setMilitaryBase(MilitaryBase militaryBase) {
        this.militaryBase = militaryBase;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransportInMilitaryBase that = (TransportInMilitaryBase) o;

        if (amount != that.amount) return false;
        if (militaryBase != null ? !militaryBase.equals(that.militaryBase) : that.militaryBase != null) return false;
        return transport != null ? transport.equals(that.transport) : that.transport == null;
    }

    @Override
    public int hashCode() {
        int result = militaryBase != null ? militaryBase.hashCode() : 0;
        result = 31 * result + (transport != null ? transport.hashCode() : 0);
        result = 31 * result + amount;
        return result;
    }

    @Override
    public String toString() {
        return "TransportInMilitaryBase{" +
                "militaryBase=" + militaryBase +
                ", transport=" + transport +
                ", amount=" + amount +
                '}';
    }
}
