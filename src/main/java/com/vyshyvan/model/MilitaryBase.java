package com.vyshyvan.model;

import javax.persistence.*;

@Entity
@Table(name = "military_base")
public class MilitaryBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="army_id", nullable = false)
    private Army army;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "division_id")
    private Division division;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "corps_id")
    private Corps corps;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "brigade_id")
    private Brigade brigade;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dislocation", nullable = false)
    private Buildings dislocation;

    @OneToOne
    @JoinColumn(name = "captain_id", nullable = false)
    private Soldier captain;

    public MilitaryBase() {
    }

    public MilitaryBase(String name, Army army, Division division, Corps corps, Brigade brigade, Buildings dislocation, Soldier captain) {
        this.name = name;
        this.army = army;
        this.division = division;
        this.corps = corps;
        this.brigade = brigade;
        this.dislocation = dislocation;
        this.captain = captain;
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

    public Buildings getDislocation() {
        return dislocation;
    }

    public void setDislocation(Buildings dislocation) {
        this.dislocation = dislocation;
    }

    public Soldier getCaptain() {
        return captain;
    }

    public void setCaptain(Soldier captain) {
        this.captain = captain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MilitaryBase that = (MilitaryBase) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (army != null ? !army.equals(that.army) : that.army != null) return false;
        if (division != null ? !division.equals(that.division) : that.division != null) return false;
        if (corps != null ? !corps.equals(that.corps) : that.corps != null) return false;
        if (brigade != null ? !brigade.equals(that.brigade) : that.brigade != null) return false;
        if (dislocation != null ? !dislocation.equals(that.dislocation) : that.dislocation != null) return false;
        return captain != null ? captain.equals(that.captain) : that.captain == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (army != null ? army.hashCode() : 0);
        result = 31 * result + (division != null ? division.hashCode() : 0);
        result = 31 * result + (corps != null ? corps.hashCode() : 0);
        result = 31 * result + (brigade != null ? brigade.hashCode() : 0);
        result = 31 * result + (dislocation != null ? dislocation.hashCode() : 0);
        result = 31 * result + (captain != null ? captain.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MilitaryBase{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", army=" + army +
                ", division=" + division +
                ", corps=" + corps +
                ", brigade=" + brigade +
                ", dislocation=" + dislocation +
                ", captain=" + captain +
                '}';
    }
}
