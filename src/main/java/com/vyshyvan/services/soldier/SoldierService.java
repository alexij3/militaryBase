package com.vyshyvan.services.soldier;

import com.vyshyvan.model.Soldier;

import java.util.List;

public interface SoldierService {
    Soldier insertSoldier(Soldier soldier);
    Soldier getSoldier(int id);
    Soldier updateSoldier(Soldier soldier);
    Soldier deleteSoldier(int id);
    List<Soldier> getAll();
}
