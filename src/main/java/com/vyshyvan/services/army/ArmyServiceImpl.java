package com.vyshyvan.services.army;

import com.vyshyvan.dao.army.ArmyDAOImpl;
import com.vyshyvan.model.Army;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmyServiceImpl implements ArmyService {
    @Autowired
    ArmyDAOImpl armyDAO;

    @Override
    public Army insertArmy(Army army) {
        return armyDAO.insertArmy(army);
    }

    @Override
    public Army getArmy(int id) {
        return armyDAO.getArmy(id);
    }

    @Override
    public Army updateArmy(Army army) {
        return armyDAO.updateArmy(army);
    }

    @Override
    public Army deleteArmy(int id) {
        return armyDAO.deleteArmy(id);
    }

    @Override
    public List<Army> getAll() {
        return armyDAO.getAll();
    }
}
