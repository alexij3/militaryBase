package com.vyshyvan.dao.specialty;

import com.vyshyvan.datastorage.DataStorage;
import com.vyshyvan.model.Specialty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpecialtyDAOImpl implements SpecialtyDAO {
    @Autowired
    DataStorage dataStorage;

    @Override
    public Specialty insertSpecialty(Specialty specialty) {
        dataStorage.getSpecialties().add(specialty);
        return specialty;
    }

    @Override
    public Specialty getSpecialty(int id) {
        return dataStorage.getSpecialties().stream()
                .filter(el->el.getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public Specialty updateSpecialty(Specialty specialty) {
        for(Specialty a: dataStorage.getSpecialties())
        {
            if(a.getId() == specialty.getId())
            {
                a.setName(specialty.getName());
                a.setCode(specialty.getCode());
                break;
            }
        }
        return specialty;
    }



    @Override
    public Specialty deleteSpecialty(int id) {
        Specialty specialty = dataStorage.getSpecialties()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getSpecialties().remove(specialty);
        return specialty;
    }

    @Override
    public List<Specialty> getAll() {
        return dataStorage.getSpecialties();
    }
}
