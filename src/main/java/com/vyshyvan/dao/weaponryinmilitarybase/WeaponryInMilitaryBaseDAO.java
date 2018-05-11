package com.vyshyvan.dao.weaponryinmilitarybase;

import com.vyshyvan.model.WeaponryInMilitaryBase;

import java.util.List;

public interface WeaponryInMilitaryBaseDAO {
    WeaponryInMilitaryBase insertWeaponryInMilitaryBase(WeaponryInMilitaryBase weaponryInMilitaryBase);
    WeaponryInMilitaryBase getWeaponryInMilitaryBase(int id);
    WeaponryInMilitaryBase updateWeaponryInMilitaryBase(WeaponryInMilitaryBase weaponryInMilitaryBase);
    WeaponryInMilitaryBase deleteWeaponryInMilitaryBase(int id);
    List<WeaponryInMilitaryBase> getAll();
}
