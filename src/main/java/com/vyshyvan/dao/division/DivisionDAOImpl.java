package com.vyshyvan.dao.division;

import com.vyshyvan.datastorage.DataStorage;
import com.vyshyvan.model.Division;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DivisionDAOImpl implements DivisionDAO {
    @Autowired
    DataStorage dataStorage;

    @Override
    public Division insertDivision(Division division) {
        dataStorage.getDivisions().add(division);
        return division;
    }

    @Override
    public Division getDivision(int id) {
        return dataStorage.getDivisions().stream()
                .filter(el->el.getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public Division updateDivision(Division division) {
        for(Division a: dataStorage.getDivisions())
        {
            if(a.getId() == division.getId())
            {
                a.setCodeNumber(division.getCodeNumber());
                a.setName(division.getName());
                break;
            }
        }
        return division;
    }



    @Override
    public Division deleteDivision(int id) {
        Division division = dataStorage.getDivisions()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getDivisions().remove(division);
        return division;
    }

    @Override
    public List<Division> getAll() {
        return dataStorage.getDivisions();
    }

}
