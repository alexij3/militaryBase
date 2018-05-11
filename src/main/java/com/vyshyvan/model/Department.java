package com.vyshyvan.model;

public class Department {
    private Integer id;
    private String codeNumber;
    private String name;
    private Platoon platoon;
    private Soldier captain;

    public Department(Integer id, String codeNumber, String name, Platoon platoon, Soldier captain) {
        this.id = id;
        this.codeNumber = codeNumber;
        this.name = name;
        this.platoon = platoon;
        this.captain = captain;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodeNumber() {
        return codeNumber;
    }

    public void setCodeNumber(String codeNumber) {
        this.codeNumber = codeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Platoon getPlatoon() {
        return platoon;
    }

    public void setPlatoon(Platoon platoon) {
        this.platoon = platoon;
    }

    public Soldier getCaptain() {
        return captain;
    }

    public void setCaptain(Soldier captain) {
        this.captain = captain;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", codeNumber='" + codeNumber + '\'' +
                ", name='" + name + '\'' +
                ", platoon=" + platoon +
                ", captain=" + captain +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (codeNumber != null ? !codeNumber.equals(that.codeNumber) : that.codeNumber != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (platoon != null ? !platoon.equals(that.platoon) : that.platoon != null) return false;
        return captain != null ? captain.equals(that.captain) : that.captain == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (codeNumber != null ? codeNumber.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (platoon != null ? platoon.hashCode() : 0);
        result = 31 * result + (captain != null ? captain.hashCode() : 0);
        return result;
    }
}
