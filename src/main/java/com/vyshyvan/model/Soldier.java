package com.vyshyvan.model;

import javax.persistence.*;
import java.util.Set;

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

    @Column(name = "military_base_id", insertable = false, updatable = false)
    private int militaryBaseId;

    @ElementCollection(targetClass = Specialty.class)
    @CollectionTable(name = "soldier_specialty", joinColumns = @JoinColumn (name = "id_soldier", nullable = false))

    @Enumerated(EnumType.STRING)
    @Column(name = "specialty", nullable = false)
    private Set<Specialty> specialty;

    public Soldier() {
    }

    public Soldier(String name, int age, MilitaryBase militaryBase, int militaryBaseId, Set<Specialty> specialty) {
        this.name = name;
        this.age = age;
        this.militaryBase = militaryBase;
        this.militaryBaseId = militaryBaseId;
        this.specialty = specialty;
    }

    public Soldier(String name, int age, MilitaryBase militaryBase, Set<Specialty> specialty) {
        this.name = name;
        this.age = age;
        this.militaryBase = militaryBase;
        this.specialty = specialty;
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

    public Set<Specialty> getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Set<Specialty> specialty) {
        this.specialty = specialty;
    }

    public int getMilitaryBaseId() {
        return militaryBaseId;
    }

    public void setMilitaryBaseId(int militaryBaseId) {
        this.militaryBaseId = militaryBaseId;
    }
}
