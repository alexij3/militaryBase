package com.vyshyvan.dao.platoon;

import com.vyshyvan.datastorage.DataStorage;
import com.vyshyvan.model.Platoon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class PlatoonDAOImpl implements PlatoonDAO {
    @Autowired
    DataStorage dataStorage;

    @Override
    public Platoon insertPlatoon(Platoon platoon) {
        dataStorage.getPlatoons().add(platoon);
        return platoon;
    }

    @Override
    public Platoon getPlatoon(int id) {
        return dataStorage.getPlatoons().stream()
                .filter(el->el.getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public Platoon updatePlatoon(Platoon platoon) {
        for(Platoon a: dataStorage.getPlatoons())
        {
            if(a.getId() == platoon.getId())
            {
                a.setCodeNumber(platoon.getCodeNumber());
                a.setName(platoon.getName());
                a.setSquadron(platoon.getSquadron());
                break;
            }
        }
        return platoon;
    }



    @Override
    public Platoon deletePlatoon(int id) {
        Platoon platoon = dataStorage.getPlatoons()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getPlatoons().remove(platoon);
        return platoon;
    }

    @Override
    public List<Platoon> getAll() {
        return dataStorage.getPlatoons();
    }
}
