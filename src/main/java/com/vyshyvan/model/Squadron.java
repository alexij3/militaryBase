package com.vyshyvan.model;

public class Squadron {
    private Integer id;
    private String codeNumber;
    private String name;
    private MilitaryBase militaryBase;

    public Squadron(Integer id, String codeNumber, String name, MilitaryBase militaryBase) {
        this.id = id;
        this.codeNumber = codeNumber;
        this.name = name;
        this.militaryBase = militaryBase;
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

    public MilitaryBase getMilitaryBase() {
        return militaryBase;
    }

    public void setMilitaryBase(MilitaryBase militaryBase) {
        this.militaryBase = militaryBase;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Squadron squadron = (Squadron) o;

        if (id != null ? !id.equals(squadron.id) : squadron.id != null) return false;
        if (codeNumber != null ? !codeNumber.equals(squadron.codeNumber) : squadron.codeNumber != null) return false;
        if (name != null ? !name.equals(squadron.name) : squadron.name != null) return false;
        return militaryBase != null ? militaryBase.equals(squadron.militaryBase) : squadron.militaryBase == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (codeNumber != null ? codeNumber.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (militaryBase != null ? militaryBase.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Squadron{" +
                "id=" + id +
                ", codeNumber='" + codeNumber + '\'' +
                ", name='" + name + '\'' +
                ", militaryBase=" + militaryBase +
                '}';
    }
}
