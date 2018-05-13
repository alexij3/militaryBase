package com.vyshyvan.model;

import javax.persistence.*;

@Entity
public class Ordinary {
    @OneToOne
    @JoinColumn(name = "soldier_id")
    private Soldier soldier;

    @Enumerated(EnumType.STRING)
    @Column(name = "rang")
    private Rang rang;

    public Ordinary() {
    }

    public Ordinary(Soldier soldier, Rang rang) {
        this.soldier = soldier;
        this.rang = rang;
    }

    public Soldier getSoldier() {
        return soldier;
    }

    public void setSoldier(Soldier soldier) {
        this.soldier = soldier;
    }

    public Rang getRang() {
        return rang;
    }

    public void setRang(Rang rang) {
        this.rang = rang;
    }


}
