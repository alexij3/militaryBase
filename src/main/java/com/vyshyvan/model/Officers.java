package com.vyshyvan.model;

public class Officers {
    private Soldier soldier;
    private Rang rang;
    private String academyGraduation;
    private String becameGeneral;

    public Officers(Soldier soldier, Rang rang, String academyGraduation, String becameGeneral) {
        this.soldier = soldier;
        this.rang = rang;
        this.academyGraduation = academyGraduation;
        this.becameGeneral = becameGeneral;
    }

    public Soldier getSoldier() {
        return soldier;
    }

    public void setSoldier(Soldier soldier) {
        this.soldier = soldier;
    }

    public Rang getRang() {
        return rang;
    }

    public void setRang(Rang rang) {
        this.rang = rang;
    }

    public String getAcademyGraduation() {
        return academyGraduation;
    }

    public void setAcademyGraduation(String academyGraduation) {
        this.academyGraduation = academyGraduation;
    }

    public String getBecameGeneral() {
        return becameGeneral;
    }

    public void setBecameGeneral(String becameGeneral) {
        this.becameGeneral = becameGeneral;
    }

    @Override
    public String toString() {
        return "Officers{" +
                "soldier=" + soldier +
                ", rang=" + rang +
                ", academyGraduation='" + academyGraduation + '\'' +
                ", becameGeneral='" + becameGeneral + '\'' +
                '}';
    }
}
