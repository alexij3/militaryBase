package com.vyshyvan.services.buildings;

import com.vyshyvan.dao.buildings.BuildingsDAOImpl;
import com.vyshyvan.model.Buildings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingsServiceImpl implements BuildingsService {
    @Autowired
    BuildingsDAOImpl buildingsDAO;

    @Override
    public Buildings insertBuildings(Buildings buildings) {
        return buildingsDAO.insertBuildings(buildings);
    }

    @Override
    public Buildings getBuildings(int id) {
        return buildingsDAO.getBuildings(id);
    }

    @Override
    public Buildings updateBuildings(Buildings buildings) {
        return buildingsDAO.updateBuildings(buildings);
    }

    @Override
    public Buildings deleteBuildings(int id) {
        return buildingsDAO.deleteBuildings(id);
    }

    @Override
    public List<Buildings> getAll() {
        return buildingsDAO.getAll();
    }
}
