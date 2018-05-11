package com.vyshyvan.dao.division;

import com.vyshyvan.model.Division;

import java.util.List;

public interface DivisionDAO {
    Division insertDivision(Division division);
    Division getDivision(int id);
    Division updateDivision(Division division);
    Division deleteDivision(int id);
    List<Division> getAll();
}
