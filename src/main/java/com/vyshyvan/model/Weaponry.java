package com.vyshyvan.model;

import javax.persistence.*;

@Entity
public class Weaponry {
    private Integer id;
    @Enumerated(EnumType.STRING)
    @Column(name = "weaponry_type")
    private WeaponryType weaponryType;

    @Column
    private String name;

    @Column
    private String caliber;

    @Column
    private char silencer;

    public Weaponry(Integer id, WeaponryType weaponryType, String name, String caliber, char silencer) {
        this.id = id;
        this.weaponryType = weaponryType;
        this.name = name;
        this.caliber = caliber;
        this.silencer = silencer;
    }

    public Weaponry() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public WeaponryType getWeaponryType() {
        return weaponryType;
    }

    public void setWeaponryType(WeaponryType weaponryType) {
        this.weaponryType = weaponryType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaliber() {
        return caliber;
    }

    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }

    public char getSilencer() {
        return silencer;
    }

    public void setSilencer(char silencer) {
        this.silencer = silencer;
    }
}
