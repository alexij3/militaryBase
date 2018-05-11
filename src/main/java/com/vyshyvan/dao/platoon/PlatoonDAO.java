package com.vyshyvan.dao.platoon;

import com.vyshyvan.model.Platoon;

import java.util.List;

public interface PlatoonDAO {
    Platoon insertPlatoon(Platoon platoon);
    Platoon getPlatoon(int id);
    Platoon updatePlatoon(Platoon platoon);
    Platoon deletePlatoon(int id);
    List<Platoon> getAll();
}
