package com.vyshyvan.model;

import javax.persistence.*;

@Entity
public class Platoon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "code_number")
    private String codeNumber;

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "squadron_id", nullable = false)
    private Squadron squadron;

    public Platoon() {
    }

    public Platoon(String codeNumber, String name, Squadron squadron) {
        this.codeNumber = codeNumber;
        this.name = name;
        this.squadron = squadron;
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

    public Squadron getSquadron() {
        return squadron;
    }

    public void setSquadron(Squadron squadron) {
        this.squadron = squadron;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Platoon platoon = (Platoon) o;

        if (id != null ? !id.equals(platoon.id) : platoon.id != null) return false;
        if (codeNumber != null ? !codeNumber.equals(platoon.codeNumber) : platoon.codeNumber != null) return false;
        if (name != null ? !name.equals(platoon.name) : platoon.name != null) return false;
        return squadron != null ? squadron.equals(platoon.squadron) : platoon.squadron == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (codeNumber != null ? codeNumber.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (squadron != null ? squadron.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Platoon{" +
                "id=" + id +
                ", codeNumber='" + codeNumber + '\'' +
                ", name='" + name + '\'' +
                ", squadron=" + squadron +
                '}';
    }
}
