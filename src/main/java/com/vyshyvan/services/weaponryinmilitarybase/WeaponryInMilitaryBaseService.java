package com.vyshyvan.services.weaponryinmilitarybase;

import com.vyshyvan.model.WeaponryInMilitaryBase;

import java.util.List;

public interface WeaponryInMilitaryBaseService {
    WeaponryInMilitaryBase insertWeaponryInMilitaryBase(WeaponryInMilitaryBase weaponryInMilitaryBase);
    WeaponryInMilitaryBase getWeaponryInMilitaryBase(int id);
    WeaponryInMilitaryBase updateWeaponryInMilitaryBase(WeaponryInMilitaryBase weaponryInMilitaryBase);
    void deleteWeaponryInMilitaryBase(int id);
    List<WeaponryInMilitaryBase> getAll();
}
