package com.vyshyvan.dao.transportinmilitarybase;

import com.vyshyvan.model.TransportInMilitaryBase;

import java.util.List;

public interface TransportInMilitaryBaseDAO {
    TransportInMilitaryBase insertTransportInMilitaryBase(TransportInMilitaryBase transportInMilitaryBase);
    TransportInMilitaryBase getTransportInMilitaryBase(int id);
    TransportInMilitaryBase updateTransportInMilitaryBase(TransportInMilitaryBase transportInMilitaryBase);
    TransportInMilitaryBase deleteTransportInMilitaryBase(int id);
    List<TransportInMilitaryBase> getAll();
}
