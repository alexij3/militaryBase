package com.vyshyvan.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@IdClass(WeaponryInMilitaryBaseID.class)
@Table(name="weaponry_in_mbase")
public class WeaponryInMilitaryBase implements Serializable{
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "military_base_id", insertable = false, updatable = false)
    private MilitaryBase militaryBase;

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "weaponry_id", insertable = false, updatable = false)
    private Weaponry weaponry;

    @Column
    private int amount;

    public WeaponryInMilitaryBase() {
    }

    public WeaponryInMilitaryBase(MilitaryBase militaryBase, Weaponry weaponry, int amount) {
        this.militaryBase = militaryBase;
        this.weaponry = weaponry;
        this.amount = amount;
    }

    public MilitaryBase getMilitaryBase() {
        return militaryBase;
    }

    public void setMilitaryBase(MilitaryBase militaryBase) {
        this.militaryBase = militaryBase;
    }

    public Weaponry getWeaponry() {
        return weaponry;
    }

    public void setWeaponry(Weaponry weaponry) {
        this.weaponry = weaponry;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
