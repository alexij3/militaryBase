package com.vyshyvan.dao.soldier;

import com.vyshyvan.datastorage.DataStorage;
import com.vyshyvan.model.Soldier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SoldierDAOImpl implements SoldierDAO {
    @Autowired
    DataStorage dataStorage;

    @Override
    public Soldier insertSoldier(Soldier soldier) {
        dataStorage.getSoldiers().add(soldier);
        return soldier;
    }

    @Override
    public Soldier getSoldier(int id) {
        return dataStorage.getSoldiers().stream()
                .filter(el->el.getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public Soldier updateSoldier(Soldier soldier) {
        for(Soldier a: dataStorage.getSoldiers())
        {
            if(a.getId() == soldier.getId())
            {
                a.setName(soldier.getName());
                a.setAge(soldier.getAge());
                a.setSpecialty(soldier.getSpecialty());
                a.setMilitaryBaseID(soldier.getMilitaryBaseID());
                break;
            }
        }
        return soldier;
    }



    @Override
    public Soldier deleteSoldier(int id) {
        Soldier soldier = dataStorage.getSoldiers()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getSoldiers().remove(soldier);
        return soldier;
    }

    @Override
    public List<Soldier> getAll() {
        return dataStorage.getSoldiers();
    }

}
