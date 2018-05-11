package com.vyshyvan.dao.specialty;

import com.vyshyvan.model.Specialty;

import java.util.List;

public interface SpecialtyDAO {
    Specialty insertSpecialty(Specialty specialty);
    Specialty getSpecialty(int id);
    Specialty updateSpecialty(Specialty specialty);
    Specialty deleteSpecialty(int id);
    List<Specialty> getAll();
}
