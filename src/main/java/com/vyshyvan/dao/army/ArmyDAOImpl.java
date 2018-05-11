package com.vyshyvan.dao.army;

import com.vyshyvan.datastorage.DataStorage;
import com.vyshyvan.model.Army;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArmyDAOImpl implements ArmyDAO {
    @Autowired
    DataStorage dataStorage;

    @Override
    public Army insertArmy(Army army) {
        dataStorage.getArmies().add(army);
        return army;
    }

    @Override
    public Army getArmy(int id) {
        return dataStorage.getArmies().stream()
                .filter(el->el.getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public Army updateArmy(Army army) {
        for(Army a: dataStorage.getArmies())
        {
            if(a.getId() == army.getId())
            {
                a.setCodeNumber(army.getCodeNumber());
                a.setName(army.getName());
                break;
            }
        }
        return army;
    }



    @Override
    public Army deleteArmy(int id) {
        Army army = dataStorage.getArmies()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getArmies().remove(army);
        return army;
    }

    @Override
    public List<Army> getAll() {
        return dataStorage.getArmies();
    }
}
