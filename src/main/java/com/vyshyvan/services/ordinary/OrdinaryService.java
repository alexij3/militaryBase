package com.vyshyvan.services.ordinary;

import com.vyshyvan.model.Ordinary;

import java.util.List;

public interface OrdinaryService {
    Ordinary insertOrdinary(Ordinary ordinary);
    Ordinary getOrdinary(int id);
    Ordinary updateOrdinary(Ordinary ordinary);
    Ordinary deleteOrdinary(int id);
    List<Ordinary> getAll();
}
