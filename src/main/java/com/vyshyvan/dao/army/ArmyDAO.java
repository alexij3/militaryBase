package com.vyshyvan.dao.army;

import com.vyshyvan.model.Army;

import java.util.List;

public interface ArmyDAO {
    Army insertArmy(Army army);
    Army getArmy(int id);
    Army updateArmy(Army army);
    Army deleteArmy(int id);
    List<Army> getAll();
}
