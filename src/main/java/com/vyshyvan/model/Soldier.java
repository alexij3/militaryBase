package com.vyshyvan.model;

public class Soldier {
    private Integer id;
    private String name;
    private int age;
    private int militaryBaseID;
    private Specialty specialty;

    public Soldier(Integer id, String name, int age, int militaryBaseID, Specialty specialty) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.militaryBaseID = militaryBaseID;
        this.specialty = specialty;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
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

    public int getMilitaryBaseID() {
        return militaryBaseID;
    }

    public void setMilitaryBaseID(int militaryBaseID) {
        this.militaryBaseID = militaryBaseID;
    }
}
