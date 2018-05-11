package com.vyshyvan.dao.squadron;

import com.vyshyvan.model.Squadron;

import java.util.List;

public interface SquadronDAO {
    Squadron insertSquadron(Squadron squadron);
    Squadron getSquadron(int id);
    Squadron updateSquadron(Squadron squadron);
    Squadron deleteSquadron(int id);
    List<Squadron> getAll();
}
