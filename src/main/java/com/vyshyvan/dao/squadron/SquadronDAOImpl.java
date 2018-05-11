package com.vyshyvan.dao.squadron;

import com.vyshyvan.datastorage.DataStorage;
import com.vyshyvan.model.Squadron;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SquadronDAOImpl implements SquadronDAO{
    @Autowired
    DataStorage dataStorage;

    @Override
    public Squadron insertSquadron(Squadron squadron) {
        dataStorage.getSquadrons().add(squadron);
        return squadron;
    }

    @Override
    public Squadron getSquadron(int id) {
        return dataStorage.getSquadrons().stream()
                .filter(el->el.getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public Squadron updateSquadron(Squadron squadron) {
        for(Squadron a: dataStorage.getSquadrons())
        {
            if(a.getId() == squadron.getId())
            {
                a.setCodeNumber(squadron.getCodeNumber());
                a.setName(squadron.getName());
                a.setMilitaryBase(squadron.getMilitaryBase());
                break;
            }
        }
        return squadron;
    }



    @Override
    public Squadron deleteSquadron(int id) {
        Squadron squadron = dataStorage.getSquadrons()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getSquadrons().remove(squadron);
        return squadron;
    }

    @Override
    public List<Squadron> getAll() {
        return dataStorage.getSquadrons();
    }
}
