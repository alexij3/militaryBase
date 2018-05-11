package com.vyshyvan.services.army;

import com.vyshyvan.dao.army.ArmyDAO;
import com.vyshyvan.model.Army;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmyServiceImpl implements ArmyService {
    @Autowired
    ArmyDAO armyDAO;

    @Override
    public Army insertArmy(Army army) {
        return armyDAO.save(army);
    }

    @Override
    public Army getArmy(int id) {
        return armyDAO.findById(id).get();
    }

    @Override
    public Army updateArmy(Army army) {
        return armyDAO.save(army);
    }

    @Override
    public void deleteArmy(int id) {
        armyDAO.deleteById(id);
    }

    @Override
    public List<Army> getAll() {
        return (List<Army>)armyDAO.findAll();
    }
}
