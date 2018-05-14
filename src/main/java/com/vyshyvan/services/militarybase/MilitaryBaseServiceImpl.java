package com.vyshyvan.services.militarybase;

import com.vyshyvan.model.MilitaryBase;
import com.vyshyvan.repositories.militarybase.MilitaryBaseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MilitaryBaseServiceImpl implements MilitaryBaseService {
    @Autowired
    MilitaryBaseDAO militaryBaseDAO;

    @Override
    public MilitaryBase insertMilitaryBase(MilitaryBase militaryBase) {
        return militaryBaseDAO.save(militaryBase);
    }

    @Override
    public MilitaryBase getMilitaryBase(int id) {
        return militaryBaseDAO.findById(id).get();
    }

    @Override
    public MilitaryBase updateMilitaryBase(MilitaryBase militaryBase) {
        return militaryBaseDAO.save(militaryBase);
    }

    @Override
    public void deleteMilitaryBase(int id) {
        militaryBaseDAO.deleteById(id);
    }

    @Override
    public List<MilitaryBase> getAll() {
        return (List<MilitaryBase>) militaryBaseDAO.findAll();
    }
}
