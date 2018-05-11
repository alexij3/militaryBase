package com.vyshyvan.dao.officers;

import com.vyshyvan.datastorage.DataStorage;
import com.vyshyvan.model.Officers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OfficersDAOImpl implements OfficersDAO {
    @Autowired
    DataStorage dataStorage;

    @Override
    public Officers insertOfficers(Officers officers) {
        dataStorage.getOfficers().add(officers);
        return officers;
    }

    @Override
    public Officers getOfficers(int id) {
        return dataStorage.getOfficers().stream()
                .filter(el->el.getSoldier().getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public Officers updateOfficers(Officers officers) {
        for(Officers a: dataStorage.getOfficers())
        {
            if(a.getSoldier().getId() == officers.getSoldier().getId())
            {
                a.getSoldier().setMilitaryBaseID(officers.getSoldier().getMilitaryBaseID());
                a.getSoldier().setName(officers.getSoldier().getName());
                a.getSoldier().setSpecialty(officers.getSoldier().getSpecialty());
                a.getSoldier().setAge(officers.getSoldier().getAge());
                a.setAcademyGraduation(officers.getAcademyGraduation());
                a.setBecameGeneral(officers.getBecameGeneral());
                a.setRang(officers.getRang());
                break;
            }
        }
        return officers;
    }



    @Override
    public Officers deleteOfficers(int id) {
        Officers officers = dataStorage.getOfficers()
                .stream()
                .filter(el -> el.getSoldier().getId() == id)
                .findFirst()
                .get();
        dataStorage.getOfficers().remove(officers);
        return officers;
    }

    @Override
    public List<Officers> getAll() {
        return dataStorage.getOfficers();
    }
}
