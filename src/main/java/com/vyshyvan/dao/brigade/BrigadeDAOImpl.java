package com.vyshyvan.dao.brigade;

import com.vyshyvan.datastorage.DataStorage;
import com.vyshyvan.model.Brigade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BrigadeDAOImpl implements BrigadeDAO {
    @Autowired
    DataStorage dataStorage;

    @Override
    public Brigade insertBrigade(Brigade brigade) {
        dataStorage.getBrigades().add(brigade);
        return brigade;
    }

    @Override
    public Brigade getBrigade(int id) {
        return dataStorage.getBrigades().stream()
                .filter(el->el.getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public Brigade updateBrigade(Brigade brigade) {
        for(Brigade a: dataStorage.getBrigades())
        {
            if(a.getId() == brigade.getId())
            {
                a.setCodeNumber(brigade.getCodeNumber());
                a.setName(brigade.getName());
                break;
            }
        }
        return brigade;
    }



    @Override
    public Brigade deleteBrigade(int id) {
        Brigade brigade = dataStorage.getBrigades()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getBrigades().remove(brigade);
        return brigade;
    }

    @Override
    public List<Brigade> getAll() {
        return dataStorage.getBrigades();
    }
}
