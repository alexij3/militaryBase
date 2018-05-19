package com.vyshyvan.services.weaponryinmilitarybase;

import com.vyshyvan.model.WeaponryInMilitaryBase;
import com.vyshyvan.repositories.weaponryinmilitarybase.WeaponryInMilitaryBaseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeaponryInMilitaryBaseServiceImpl implements WeaponryInMilitaryBaseService {
    @Autowired
    WeaponryInMilitaryBaseDAO weaponryInMilitaryBaseDAO;

    @Override
    public WeaponryInMilitaryBase insertWeaponryInMilitaryBase(WeaponryInMilitaryBase weaponryInMilitaryBase) {
        return weaponryInMilitaryBaseDAO.save(weaponryInMilitaryBase);
    }

    @Override
    public WeaponryInMilitaryBase getWeaponryInMilitaryBase(int id) {
        return weaponryInMilitaryBaseDAO.findById(id).get();
    }

    @Override
    public WeaponryInMilitaryBase updateWeaponryInMilitaryBase(WeaponryInMilitaryBase weaponryInMilitaryBase) {
        return weaponryInMilitaryBaseDAO.save(weaponryInMilitaryBase);
    }

    @Override
    public void deleteWeaponryInMilitaryBase(int id) {
        weaponryInMilitaryBaseDAO.deleteById(id);
    }

    @Override
    public List<WeaponryInMilitaryBase> getAll() {
        return (List<WeaponryInMilitaryBase>) weaponryInMilitaryBaseDAO.findAll();
    }
}
