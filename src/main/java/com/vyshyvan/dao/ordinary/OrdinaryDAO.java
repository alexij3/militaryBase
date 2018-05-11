package com.vyshyvan.dao.ordinary;

import com.vyshyvan.model.Ordinary;

import java.util.List;

public interface OrdinaryDAO {
    Ordinary insertOrdinary(Ordinary ordinary);
    Ordinary getOrdinary(int id);
    Ordinary updateOrdinary(Ordinary ordinary);
    Ordinary deleteOrdinary(int id);
    List<Ordinary> getAll();
}
