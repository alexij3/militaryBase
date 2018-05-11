package com.vyshyvan.services.soldier;

import com.vyshyvan.dao.soldier.SoldierDAOImpl;
import com.vyshyvan.model.Soldier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoldierServiceImpl implements SoldierService {
    @Autowired
    SoldierDAOImpl soldierDAO;

    @Override
    public Soldier insertSoldier(Soldier soldier) {
        return soldierDAO.insertSoldier(soldier);
    }

    @Override
    public Soldier getSoldier(int id) {
        return soldierDAO.getSoldier(id);
    }

    @Override
    public Soldier updateSoldier(Soldier soldier) {
        return soldierDAO.updateSoldier(soldier);
    }

    @Override
    public Soldier deleteSoldier(int id) {
        return soldierDAO.deleteSoldier(id);
    }

    @Override
    public List<Soldier> getAll() {
        return soldierDAO.getAll();
    }
}
