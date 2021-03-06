package com.vyshyvan.model;

import javax.persistence.*;

@Entity
public class Soldier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private int age;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "military_base_id", nullable = false)
    private MilitaryBase militaryBase;

    public Soldier() {
    }

    public Soldier(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Soldier(String name, int age, MilitaryBase militaryBase) {
        this.name = name;
        this.age = age;
        this.militaryBase = militaryBase;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MilitaryBase getMilitaryBase() {
        return militaryBase;
    }

    public void setMilitaryBase(MilitaryBase militaryBase) {
        this.militaryBase = militaryBase;
    }
}
