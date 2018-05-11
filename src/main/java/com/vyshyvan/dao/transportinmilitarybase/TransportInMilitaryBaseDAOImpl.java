package com.vyshyvan.dao.transportinmilitarybase;

import com.vyshyvan.datastorage.DataStorage;
import com.vyshyvan.model.TransportInMilitaryBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TransportInMilitaryBaseDAOImpl implements TransportInMilitaryBaseDAO {
    @Autowired
    DataStorage dataStorage;

    @Override
    public TransportInMilitaryBase insertTransportInMilitaryBase(TransportInMilitaryBase transportInMilitaryBase) {
        dataStorage.getTransportInMilitaryBases().add(transportInMilitaryBase);
        return transportInMilitaryBase;
    }

    @Override
    public TransportInMilitaryBase getTransportInMilitaryBase(int id) {
        return dataStorage.getTransportInMilitaryBases().stream()
                .filter(el->el.getTransport().getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public TransportInMilitaryBase updateTransportInMilitaryBase(TransportInMilitaryBase transportInMilitaryBase) {
        for(TransportInMilitaryBase a: dataStorage.getTransportInMilitaryBases())
        {
            if(a.getTransport().getId() == transportInMilitaryBase.getTransport().getId())
            {
                a.setAmount(transportInMilitaryBase.getAmount());
                a.setMilitaryBase(transportInMilitaryBase.getMilitaryBase());
                a.setTransport(transportInMilitaryBase.getTransport());
                break;
            }
        }
        return transportInMilitaryBase;
    }



    @Override
    public TransportInMilitaryBase deleteTransportInMilitaryBase(int id) {
        TransportInMilitaryBase transportInMilitaryBase = dataStorage.getTransportInMilitaryBases()
                .stream()
                .filter(el -> el.getTransport().getId() == id)
                .findFirst()
                .get();
        dataStorage.getTransportInMilitaryBases().remove(transportInMilitaryBase);
        return transportInMilitaryBase;
    }

    @Override
    public List<TransportInMilitaryBase> getAll() {
        return dataStorage.getTransportInMilitaryBases();
    }
}
