package com.vyshyvan.services.officers;

import com.vyshyvan.model.Officers;
import com.vyshyvan.model.Rang;
import com.vyshyvan.repositories.officers.OfficersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficersServiceImpl implements OfficersService {
    @Autowired
    OfficersDAO officersDAO;

    @Override
    public Officers insertOfficers(Officers officers) {
        return officersDAO.save(officers);
    }

    @Override
    public Officers getOfficers(int id) {
        return officersDAO.findById(id).get();
    }

    @Override
    public Officers updateOfficers(Officers officers) {
        return officersDAO.save(officers);
    }

    @Override
    public void deleteOfficers(int id) {
        officersDAO.deleteById(id);
    }

    @Override
    public List<Officers> getAll() {
        return (List<Officers>) officersDAO.findAll();
    }

    @Override
    public List<Officers> findAllByRang(Rang rang) {
        return officersDAO.findAllByRang(rang);
    }
}
