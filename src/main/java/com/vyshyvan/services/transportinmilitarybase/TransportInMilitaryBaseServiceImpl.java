package com.vyshyvan.services.transportinmilitarybase;

import com.vyshyvan.model.TransportInMilitaryBase;
import com.vyshyvan.repositories.transportinmilitarybase.TransportInMilitaryBaseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportInMilitaryBaseServiceImpl implements TransportInMilitaryBaseService{
    @Autowired
    TransportInMilitaryBaseDAO transportInMilitaryBaseDAO;

    @Override
    public TransportInMilitaryBase insertTransportInMilitaryBase(TransportInMilitaryBase transportInMilitaryBase) {
        return transportInMilitaryBaseDAO.save(transportInMilitaryBase);
    }

    @Override
    public TransportInMilitaryBase getTransportInMilitaryBase(int id) {
        return transportInMilitaryBaseDAO.findById(id).get();
    }

    @Override
    public TransportInMilitaryBase updateTransportInMilitaryBase(TransportInMilitaryBase transportInMilitaryBase) {
        return transportInMilitaryBaseDAO.save(transportInMilitaryBase);
    }

    @Override
    public void deleteTransportInMilitaryBase(int id) {
        transportInMilitaryBaseDAO.deleteById(id);
    }

    @Override
    public List<TransportInMilitaryBase> getAll() {
        return (List<TransportInMilitaryBase>) transportInMilitaryBaseDAO.findAll();
    }
}
