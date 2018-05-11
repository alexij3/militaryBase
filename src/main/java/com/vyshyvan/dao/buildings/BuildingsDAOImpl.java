package com.vyshyvan.dao.buildings;

import com.vyshyvan.datastorage.DataStorage;
import com.vyshyvan.model.Buildings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BuildingsDAOImpl implements BuildingsDAO {
    @Autowired
    DataStorage dataStorage;

    @Override
    public Buildings insertBuildings(Buildings buildings) {
        dataStorage.getBuildings().add(buildings);
        return buildings;
    }

    @Override
    public Buildings getBuildings(int id) {
        return dataStorage.getBuildings().stream()
                .filter(el->el.getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public Buildings updateBuildings(Buildings buildings) {
        for(Buildings a: dataStorage.getBuildings())
        {
            if(a.getId() == buildings.getId())
            {
                a.setName(buildings.getName());
                break;
            }
        }
        return buildings;
    }



    @Override
    public Buildings deleteBuildings(int id) {
        Buildings buildings = dataStorage.getBuildings()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getBuildings().remove(buildings);
        return buildings;
    }

    @Override
    public List<Buildings> getAll() {
        return dataStorage.getBuildings();
    }
}
