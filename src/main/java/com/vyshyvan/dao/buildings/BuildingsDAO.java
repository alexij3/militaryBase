package com.vyshyvan.dao.buildings;

import com.vyshyvan.model.Buildings;

import java.util.List;

public interface BuildingsDAO {
    Buildings insertBuildings(Buildings buildings);
    Buildings getBuildings(int id);
    Buildings updateBuildings(Buildings buildings);
    Buildings deleteBuildings(int id);
    List<Buildings> getAll();
}
