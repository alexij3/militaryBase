package com.vyshyvan.dao.officers;

import com.vyshyvan.model.Officers;

import java.util.List;

public interface OfficersDAO {
    Officers insertOfficers(Officers officers);
    Officers getOfficers(int id);
    Officers updateOfficers(Officers officers);
    Officers deleteOfficers(int id);
    List<Officers> getAll();
}
