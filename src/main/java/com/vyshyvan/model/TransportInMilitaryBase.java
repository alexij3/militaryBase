package com.vyshyvan.model;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(TransportInMilitaryBaseID.class)
@Table(name="transport_in_mbase")
public class TransportInMilitaryBase implements Serializable{
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "military_base_id", insertable = false, updatable = false)
    private MilitaryBase militaryBase;

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "transport_id", insertable = false, updatable = false)
    private Transport transport;

    @Column
    private int amount;

    public TransportInMilitaryBase() {
    }

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
}
