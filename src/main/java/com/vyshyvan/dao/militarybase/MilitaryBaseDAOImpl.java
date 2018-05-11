package com.vyshyvan.dao.militarybase;

import com.vyshyvan.datastorage.DataStorage;
import com.vyshyvan.model.MilitaryBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MilitaryBaseDAOImpl implements MilitaryBaseDAO {
    @Autowired
    DataStorage dataStorage;

    @Override
    public MilitaryBase insertMilitaryBase(MilitaryBase militaryBase) {
        dataStorage.getMilitaryBases().add(militaryBase);
        return militaryBase;
    }

    @Override
    public MilitaryBase getMilitaryBase(int id) {
        return dataStorage.getMilitaryBases().stream()
                .filter(el->el.getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public MilitaryBase updateMilitaryBase(MilitaryBase militaryBase) {
        for(MilitaryBase a: dataStorage.getMilitaryBases())
        {
            if(a.getId() == militaryBase.getId())
            {
                a.setName(militaryBase.getName());
                a.setArmy(militaryBase.getArmy());
                a.setBrigade(militaryBase.getBrigade());
                a.setCaptain(militaryBase.getCaptain());
                a.setCorps(militaryBase.getCorps());
                a.setDislocation(militaryBase.getDislocation());
                a.setDivision(militaryBase.getDivision());
                break;
            }
        }
        return militaryBase;
    }



    @Override
    public MilitaryBase deleteMilitaryBase(int id) {
        MilitaryBase militaryBase = dataStorage.getMilitaryBases()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getMilitaryBases().remove(militaryBase);
        return militaryBase;
    }

    @Override
    public List<MilitaryBase> getAll() {
        return dataStorage.getMilitaryBases();
    }
}
