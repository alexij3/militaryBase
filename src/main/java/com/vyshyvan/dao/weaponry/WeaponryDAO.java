package com.vyshyvan.dao.weaponry;

import com.vyshyvan.model.Weaponry;

import java.util.List;

public interface WeaponryDAO {
    Weaponry insertWeaponry(Weaponry weaponry);
    Weaponry getWeaponry(int id);
    Weaponry updateWeaponry(Weaponry weaponry);
    Weaponry deleteWeaponry(int id);
    List<Weaponry> getAll();
}
