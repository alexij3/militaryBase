package com.vyshyvan.services.soldier;

import com.vyshyvan.model.Soldier;
import com.vyshyvan.repositories.soldier.SoldierDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoldierServiceImpl implements SoldierService {
    @Autowired
    SoldierDAO soldierDAO;

    @Override
    public Soldier insertSoldier(Soldier soldier) {
        return soldierDAO.save(soldier);
    }

    @Override
    public Soldier getSoldier(int id) {
        return soldierDAO.findById(id).get();
    }

    @Override
    public Soldier updateSoldier(Soldier soldier) {
        return soldierDAO.save(soldier);
    }

    @Override
    public void deleteSoldier(int id) {
        soldierDAO.deleteById(id);
    }

    @Override
    public List<Soldier> getAll() {
        return (List<Soldier>) soldierDAO.findAll();
    }

    @Override
    public void updateSpecialties(Soldier soldier) {
        Soldier updatedSoldier = getSoldier(soldier.getId());
        updatedSoldier.getSpecialty().addAll(soldier.getSpecialty());
        soldierDAO.save(updatedSoldier);
    }

    @Override
    public void deleteSpecialties(Soldier soldier) {
        Soldier updatedSoldier = getSoldier(soldier.getId());
        updatedSoldier.getSpecialty().removeAll(soldier.getSpecialty());
        soldierDAO.save(updatedSoldier);
    }
}
