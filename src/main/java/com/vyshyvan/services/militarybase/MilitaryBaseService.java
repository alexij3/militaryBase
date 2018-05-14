package com.vyshyvan.services.militarybase;

import com.vyshyvan.model.MilitaryBase;

import java.util.List;

public interface MilitaryBaseService {
    MilitaryBase insertMilitaryBase(MilitaryBase militaryBase);
    MilitaryBase getMilitaryBase(int id);
    MilitaryBase updateMilitaryBase(MilitaryBase militaryBase);
    void deleteMilitaryBase(int id);
    List<MilitaryBase> getAll();
}
