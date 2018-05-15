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

    @Column(name = "squadron_id", nullable = false, insertable = false, updatable = false)
    private int squadronId;

    public Platoon() {
    }

    public Platoon(String codeNumber, String name, Squadron squadron) {
        this.codeNumber = codeNumber;
        this.name = name;
        this.squadron = squadron;
    }

    public Platoon(String codeNumber, String name, Squadron squadron, int squadronId) {
        this.codeNumber = codeNumber;
        this.name = name;
        this.squadron = squadron;
        this.squadronId = squadronId;
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

    public int getSquadronId() {
        return squadronId;
    }

    public void setSquadronId(int squadronId) {
        this.squadronId = squadronId;
    }
}
