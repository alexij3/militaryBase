package com.vyshyvan.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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

    @ManyToOne
    @JoinColumn(name="army_id")
    private Army army;

    @Column(name = "army_id", insertable = false, updatable = false)
    @NotNull
    private Integer armyId;

    @ManyToOne
    @JoinColumn(name = "division_id")
    private Division division;

    @Column(name = "division_id", insertable = false, updatable = false)
    private Integer divisionId;

    @ManyToOne
    @JoinColumn(name = "corps_id")
    private Corps corps;

    @Column(name = "corps_id", insertable = false, updatable = false)
    private Integer corpsId;

    @ManyToOne
    @JoinColumn(name = "brigade_id")
    private Brigade brigade;

    @Column(name = "brigade_id", insertable = false, updatable = false)
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

    public MilitaryBase(String name) {
        this.name = name;
    }

    public MilitaryBase(String name, Set<Buildings> dislocation, Soldier captain, Set<TransportInMilitaryBase> transportInMilitaryBase, Set<WeaponryInMilitaryBase> weaponryInMilitaryBase) {
        this.name = name;
        this.dislocation = dislocation;
        this.captain = captain;
        this.transportInMilitaryBase = transportInMilitaryBase;
        this.weaponryInMilitaryBase = weaponryInMilitaryBase;
    }

    public MilitaryBase(String name, Army army, Integer armyId, Division division, Integer divisionId, Corps corps, Integer corpsId, Brigade brigade, Integer brigadeId, Set<Buildings> dislocation, Soldier captain, Set<TransportInMilitaryBase> transportInMilitaryBase, Set<WeaponryInMilitaryBase> weaponryInMilitaryBase) {
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

    public Integer getArmyId() {
        return armyId;
    }

    public void setArmyId(Integer armyId) {
        this.armyId = armyId;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public Corps getCorps() {
        return corps;
    }

    public void setCorps(Corps corps) {
        this.corps = corps;
    }

    public Integer getCorpsId() {
        return corpsId;
    }

    public void setCorpsId(Integer corpsId) {
        this.corpsId = corpsId;
    }

    public Brigade getBrigade() {
        return brigade;
    }

    public void setBrigade(Brigade brigade) {
        this.brigade = brigade;
    }

    public Integer getBrigadeId() {
        return brigadeId;
    }

    public void setBrigadeId(Integer brigadeId) {
        this.brigadeId = brigadeId;
    }

    public Set<Buildings> getDislocation() {
        return dislocation;
    }

    public void setDislocation(Set<Buildings> dislocation) {
        this.dislocation = dislocation;
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

    public Soldier getCaptain() {
        return captain;
    }

    public void setCaptain(Soldier captain) {
        this.captain = captain;
    }

    @Override
    public String toString() {
        return "MilitaryBase{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
