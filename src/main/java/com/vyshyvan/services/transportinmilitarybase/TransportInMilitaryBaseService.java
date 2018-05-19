package com.vyshyvan.services.transportinmilitarybase;

import com.vyshyvan.model.TransportInMilitaryBase;

import java.util.List;

public interface TransportInMilitaryBaseService {
    TransportInMilitaryBase insertTransportInMilitaryBase(TransportInMilitaryBase transportInMilitaryBase);
    TransportInMilitaryBase getTransportInMilitaryBase(int id);
    TransportInMilitaryBase updateTransportInMilitaryBase(TransportInMilitaryBase transportInMilitaryBase);
    void deleteTransportInMilitaryBase(int id);
    List<TransportInMilitaryBase> getAll();
}
