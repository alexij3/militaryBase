package com.vyshyvan.dao.corps;

import com.vyshyvan.model.Corps;

import java.util.List;

public interface CorpsDAO {
    Corps insertCorps(Corps corps);
    Corps getCorps(int id);
    Corps updateCorps(Corps corps);
    Corps deleteCorps(int id);
    List<Corps> getAll();
}
