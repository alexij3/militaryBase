package com.vyshyvan.dao.ordinary;

import com.vyshyvan.datastorage.DataStorage;
import com.vyshyvan.model.Ordinary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrdinaryDAOImpl implements OrdinaryDAO {
    @Autowired
    DataStorage dataStorage;

    @Override
    public Ordinary insertOrdinary(Ordinary ordinary) {
        dataStorage.getOrdinaries().add(ordinary);
        return ordinary;
    }

    @Override
    public Ordinary getOrdinary(int id) {
        return dataStorage.getOrdinaries().stream()
                .filter(el->el.getSoldier().getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public Ordinary updateOrdinary(Ordinary ordinary) {
        for(Ordinary a: dataStorage.getOrdinaries())
        {
            if(a.getSoldier().getId() == ordinary.getSoldier().getId())
            {
                a.getSoldier().setMilitaryBaseID(ordinary.getSoldier().getMilitaryBaseID());
                a.getSoldier().setName(ordinary.getSoldier().getName());
                a.getSoldier().setSpecialty(ordinary.getSoldier().getSpecialty());
                a.getSoldier().setAge(ordinary.getSoldier().getAge());
                a.setRang(ordinary.getRang());
                break;
            }
        }
        return ordinary;
    }



    @Override
    public Ordinary deleteOrdinary(int id) {
        Ordinary ordinary = dataStorage.getOrdinaries()
                .stream()
                .filter(el -> el.getSoldier().getId() == id)
                .findFirst()
                .get();
        dataStorage.getOrdinaries().remove(ordinary);
        return ordinary;
    }

    @Override
    public List<Ordinary> getAll() {
        return dataStorage.getOrdinaries();
    }
}
