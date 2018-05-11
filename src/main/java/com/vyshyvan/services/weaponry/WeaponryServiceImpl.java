package com.vyshyvan.services.weaponry;

import com.vyshyvan.dao.weaponry.WeaponryDAOImpl;
import com.vyshyvan.model.Weaponry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WeaponryServiceImpl implements WeaponryService{
    @Autowired
    WeaponryDAOImpl weaponryDAO;

    @Override
    public Weaponry insertWeaponry(Weaponry weaponry) {
        return weaponryDAO.insertWeaponry(weaponry);
    }

    @Override
    public Weaponry getWeaponry(int id) {
        return weaponryDAO.getWeaponry(id);
    }

    @Override
    public Weaponry updateWeaponry(Weaponry weaponry) {
        return weaponryDAO.updateWeaponry(weaponry);
    }

    @Override
    public Weaponry deleteWeaponry(int id) {
        return weaponryDAO.deleteWeaponry(id);
    }

    @Override
    public List<Weaponry> getAll() {
        return weaponryDAO.getAll();
    }
}
