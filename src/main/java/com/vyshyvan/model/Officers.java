package com.vyshyvan.model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Officers {
    private Soldier soldier;
    private Rang rang;
    private LocalDate academyGraduation;
    private LocalDate becameGeneral;


}
