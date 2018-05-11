package com.vyshyvan.services.platoon;

import com.vyshyvan.dao.platoon.PlatoonDAOImpl;
import com.vyshyvan.model.Platoon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatoonServiceImpl implements PlatoonService {
    @Autowired
    PlatoonDAOImpl platoonDAO;

    @Override
    public Platoon insertPlatoon(Platoon platoon) {
        return platoonDAO.insertPlatoon(platoon);
    }

    @Override
    public Platoon getPlatoon(int id) {
        return platoonDAO.getPlatoon(id);
    }

    @Override
    public Platoon updatePlatoon(Platoon platoon) {
        return platoonDAO.updatePlatoon(platoon);
    }

    @Override
    public Platoon deletePlatoon(int id) {
        return platoonDAO.deletePlatoon(id);
    }

    @Override
    public List<Platoon> getAll() {
        return platoonDAO.getAll();
    }
}
