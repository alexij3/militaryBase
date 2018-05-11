package com.vyshyvan.services.transportinmilitarybase;

import com.vyshyvan.dao.transportinmilitarybase.TransportInMilitaryBaseDAO;
import com.vyshyvan.dao.transportinmilitarybase.TransportInMilitaryBaseDAOImpl;
import com.vyshyvan.model.TransportInMilitaryBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportInMilitaryBaseServiceImpl implements TransportInMilitaryBaseService{
    @Autowired
    TransportInMilitaryBaseDAOImpl transportInMilitaryBaseDAO;

    @Override
    public TransportInMilitaryBase insertTransportInMilitaryBase(TransportInMilitaryBase transportInMilitaryBase) {
        return transportInMilitaryBaseDAO.insertTransportInMilitaryBase(transportInMilitaryBase);
    }

    @Override
    public TransportInMilitaryBase getTransportInMilitaryBase(int id) {
        return transportInMilitaryBaseDAO.getTransportInMilitaryBase(id);
    }

    @Override
    public TransportInMilitaryBase updateTransportInMilitaryBase(TransportInMilitaryBase transportInMilitaryBase) {
        return transportInMilitaryBaseDAO.updateTransportInMilitaryBase(transportInMilitaryBase);
    }

    @Override
    public TransportInMilitaryBase deleteTransportInMilitaryBase(int id) {
        return transportInMilitaryBaseDAO.deleteTransportInMilitaryBase(id);
    }

    @Override
    public List<TransportInMilitaryBase> getAll() {
        return transportInMilitaryBaseDAO.getAll();
    }
}
