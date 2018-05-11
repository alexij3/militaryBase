package com.vyshyvan.dao.militarybase;

import com.vyshyvan.model.MilitaryBase;

import java.util.List;

public interface MilitaryBaseDAO {
    MilitaryBase insertMilitaryBase(MilitaryBase militaryBase);
    MilitaryBase getMilitaryBase(int id);
    MilitaryBase updateMilitaryBase(MilitaryBase militaryBase);
    MilitaryBase deleteMilitaryBase(int id);
    List<MilitaryBase> getAll();
}
