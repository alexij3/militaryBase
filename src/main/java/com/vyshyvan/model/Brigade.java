package com.vyshyvan.model;

public class Brigade {
    private Integer id;
    private String codeNumber;
    private String name;

    public Brigade(Integer id, String codeNumber, String name) {
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
        return "Brigade{" +
                "id=" + id +
                ", codeNumber='" + codeNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Brigade brigade = (Brigade) o;

        if (id != null ? !id.equals(brigade.id) : brigade.id != null) return false;
        if (codeNumber != null ? !codeNumber.equals(brigade.codeNumber) : brigade.codeNumber != null) return false;
        return name != null ? name.equals(brigade.name) : brigade.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (codeNumber != null ? codeNumber.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
