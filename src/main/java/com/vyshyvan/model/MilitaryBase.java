package com.vyshyvan.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "military_base")
public class MilitaryBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="army_id", nullable = false, insertable = false, updatable = false)
    private Army army;

    @Column(name = "army_id")
    private int armyId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "division_id" , nullable = false, insertable = false, updatable = false)
    private Division division;

    @Column(name = "division_id")
    private Integer divisionId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "corps_id",nullable = false, insertable = false, updatable = false)
    private Corps corps;

    @Column(name = "corps_id")
    private Integer corpsId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "brigade_id", nullable = false, insertable = false, updatable = false)
    private Brigade brigade;

    @Column(name = "brigade_id")
    private Integer brigadeId;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="military_base_dislocation", joinColumns = @JoinColumn(name = "military_base_id", referencedColumnName = "id", nullable = false),
                                                                inverseJoinColumns = @JoinColumn(name="dislocation", referencedColumnName = "id", nullable = false))
    private Set<Buildings> dislocation = new HashSet<>();

    @OneToOne
    @JoinColumn(name = "captain_id")
    private Soldier captain;

    @OneToMany(mappedBy = "militaryBase", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<TransportInMilitaryBase> transportInMilitaryBase = new HashSet<>();

    @OneToMany(mappedBy = "militaryBase", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<WeaponryInMilitaryBase> weaponryInMilitaryBase = new HashSet<>();


    public MilitaryBase() {
    }

    public MilitaryBase(String name, Army army, int armyId, Division division, Integer divisionId, Corps corps, Integer corpsId, Brigade brigade, Integer brigadeId, Set<Buildings> dislocation, Soldier captain, Set<TransportInMilitaryBase> transportInMilitaryBase, Set<WeaponryInMilitaryBase> weaponryInMilitaryBase) {
        this.name = name;
        this.army = army;
        this.armyId = armyId;
        this.division = division;
        this.divisionId = divisionId;
        this.corps = corps;
        this.corpsId = corpsId;
        this.brigade = brigade;
        this.brigadeId = brigadeId;
        this.dislocation = dislocation;
        this.captain = captain;
        this.transportInMilitaryBase = transportInMilitaryBase;
        this.weaponryInMilitaryBase = weaponryInMilitaryBase;
    }

    public MilitaryBase(String name, Army army, Division division, Corps corps, Brigade brigade, Set<Buildings> dislocation, Soldier captain, Set<TransportInMilitaryBase> transportInMilitaryBase, Set<WeaponryInMilitaryBase> weaponryInMilitaryBase) {
        this.name = name;
        this.army = army;
        this.division = division;
        this.corps = corps;
        this.brigade = brigade;
        this.dislocation = dislocation;
        this.captain = captain;
        this.transportInMilitaryBase = transportInMilitaryBase;
        this.weaponryInMilitaryBase = weaponryInMilitaryBase;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Corps getCorps() {
        return corps;
    }

    public void setCorps(Corps corps) {
        this.corps = corps;
    }

    public Brigade getBrigade() {
        return brigade;
    }

    public void setBrigade(Brigade brigade) {
        this.brigade = brigade;
    }

    public Set<Buildings> getDislocation() {
        return dislocation;
    }

    public void setDislocation(Set<Buildings> dislocation) {
        this.dislocation = dislocation;
    }

    public Soldier getCaptain() {
        return captain;
    }

    public void setCaptain(Soldier captain) {
        this.captain = captain;
    }

    public Set<TransportInMilitaryBase> getTransportInMilitaryBase() {
        return transportInMilitaryBase;
    }

    public void setTransportInMilitaryBase(Set<TransportInMilitaryBase> transportInMilitaryBase) {
        this.transportInMilitaryBase = transportInMilitaryBase;
    }

    public Set<WeaponryInMilitaryBase> getWeaponryInMilitaryBase() {
        return weaponryInMilitaryBase;
    }

    public void setWeaponryInMilitaryBase(Set<WeaponryInMilitaryBase> weaponryInMilitaryBase) {
        this.weaponryInMilitaryBase = weaponryInMilitaryBase;
    }

    public int getArmyId() {
        return armyId;
    }

    public void setArmyId(int armyId) {
        this.armyId = armyId;
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public Integer getCorpsId() {
        return corpsId;
    }

    public void setCorpsId(Integer corpsId) {
        this.corpsId = corpsId;
    }

    public Integer getBrigadeId() {
        return brigadeId;
    }

    public void setBrigadeId(Integer brigadeId) {
        this.brigadeId = brigadeId;
    }
}
