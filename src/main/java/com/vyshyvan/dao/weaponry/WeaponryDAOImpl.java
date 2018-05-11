package com.vyshyvan.dao.weaponry;

import com.vyshyvan.datastorage.DataStorage;
import com.vyshyvan.model.Weaponry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WeaponryDAOImpl implements WeaponryDAO{
    @Autowired
    DataStorage dataStorage;

    @Override
    public Weaponry insertWeaponry(Weaponry weaponry) {
        dataStorage.getWeaponry().add(weaponry);
        return weaponry;
    }

    @Override
    public Weaponry getWeaponry(int id) {
        return dataStorage.getWeaponry().stream()
                .filter(el->el.getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public Weaponry updateWeaponry(Weaponry weaponry) {
        for(Weaponry a: dataStorage.getWeaponry())
        {
            if(a.getId() == weaponry.getId())
            {
                a.setCaliber(weaponry.getCaliber());
                a.setSilencer(weaponry.getSilencer());
                a.setName(weaponry.getName());
                a.setWeaponryType(weaponry.getWeaponryType());
                break;
            }
        }
        return weaponry;
    }



    @Override
    public Weaponry deleteWeaponry(int id) {
        Weaponry weaponry = dataStorage.getWeaponry()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getWeaponry().remove(weaponry);
        return weaponry;
    }

    @Override
    public List<Weaponry> getAll() {
        return dataStorage.getWeaponry();
    }

}
