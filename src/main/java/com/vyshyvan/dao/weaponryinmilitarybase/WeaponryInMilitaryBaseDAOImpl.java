package com.vyshyvan.dao.weaponryinmilitarybase;

import com.vyshyvan.datastorage.DataStorage;
import com.vyshyvan.model.WeaponryInMilitaryBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WeaponryInMilitaryBaseDAOImpl implements WeaponryInMilitaryBaseDAO {
    @Autowired
    DataStorage dataStorage;

    @Override
    public WeaponryInMilitaryBase insertWeaponryInMilitaryBase(WeaponryInMilitaryBase weaponryInMilitaryBase) {
        dataStorage.getWeaponryInMilitaryBases().add(weaponryInMilitaryBase);
        return weaponryInMilitaryBase;
    }

    @Override
    public WeaponryInMilitaryBase getWeaponryInMilitaryBase(int id) {
        return dataStorage.getWeaponryInMilitaryBases().stream()
                .filter(el->el.getWeaponry().getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public WeaponryInMilitaryBase updateWeaponryInMilitaryBase(WeaponryInMilitaryBase weaponryInMilitaryBase) {
        for(WeaponryInMilitaryBase a: dataStorage.getWeaponryInMilitaryBases())
        {
            if(a.getWeaponry().getId() == weaponryInMilitaryBase.getWeaponry().getId())
            {
                a.setAmount(weaponryInMilitaryBase.getAmount());
                a.setMilitaryBase(weaponryInMilitaryBase.getMilitaryBase());
                a.setWeaponry(weaponryInMilitaryBase.getWeaponry());
                break;
            }
        }
        return weaponryInMilitaryBase;
    }



    @Override
    public WeaponryInMilitaryBase deleteWeaponryInMilitaryBase(int id) {
        WeaponryInMilitaryBase weaponryInMilitaryBase = dataStorage.getWeaponryInMilitaryBases()
                .stream()
                .filter(el -> el.getWeaponry().getId() == id)
                .findFirst()
                .get();
        dataStorage.getWeaponryInMilitaryBases().remove(weaponryInMilitaryBase);
        return weaponryInMilitaryBase;
    }

    @Override
    public List<WeaponryInMilitaryBase> getAll() {
        return dataStorage.getWeaponryInMilitaryBases();
    }
}
