package com.vyshyvan.model;


public class Army {
    private Integer id;
    private String codeNumber;
    private String name;

    public Army(Integer id, String codeNumber, String name) {
        this.id = id;
        this.codeNumber = codeNumber;
        this.name = name;
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

    @Override
    public String toString() {
        return "Army{" +
                "id=" + id +
                ", codeNumber='" + codeNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Army army = (Army) o;

        if (id != null ? !id.equals(army.id) : army.id != null) return false;
        if (codeNumber != null ? !codeNumber.equals(army.codeNumber) : army.codeNumber != null) return false;
        return name != null ? name.equals(army.name) : army.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (codeNumber != null ? codeNumber.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
