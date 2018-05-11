package com.vyshyvan.dao.brigade;

import com.vyshyvan.model.Brigade;

import java.util.List;

public interface BrigadeDAO {
    Brigade insertBrigade(Brigade brigade);
    Brigade getBrigade(int id);
    Brigade updateBrigade(Brigade brigade);
    Brigade deleteBrigade(int id);
    List<Brigade> getAll();
}
