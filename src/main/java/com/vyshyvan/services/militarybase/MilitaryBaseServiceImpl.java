package com.vyshyvan.services.militarybase;

import com.vyshyvan.dao.militarybase.MilitaryBaseDAOImpl;
import com.vyshyvan.model.MilitaryBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MilitaryBaseServiceImpl implements MilitaryBaseService {
    @Autowired
    MilitaryBaseDAOImpl militaryBaseDAO;

    @Override
    public MilitaryBase insertMilitaryBase(MilitaryBase militaryBase) {
        return militaryBaseDAO.insertMilitaryBase(militaryBase);
    }

    @Override
    public MilitaryBase getMilitaryBase(int id) {
        return militaryBaseDAO.getMilitaryBase(id);
    }

    @Override
    public MilitaryBase updateMilitaryBase(MilitaryBase militaryBase) {
        return militaryBaseDAO.updateMilitaryBase(militaryBase);
    }

    @Override
    public MilitaryBase deleteMilitaryBase(int id) {
        return militaryBaseDAO.deleteMilitaryBase(id);
    }

    @Override
    public List<MilitaryBase> getAll() {
        return militaryBaseDAO.getAll();
    }
}
