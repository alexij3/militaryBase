package com.vyshyvan.model;

public class Ordinary {
    private Soldier soldier;
    private Rang rang;

    public Ordinary(Soldier soldier, Rang rang) {
        this.soldier = soldier;
        this.rang = rang;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ordinary ordinary = (Ordinary) o;

        if (soldier != null ? !soldier.equals(ordinary.soldier) : ordinary.soldier != null) return false;
        return rang == ordinary.rang;
    }

    @Override
    public int hashCode() {
        int result = soldier != null ? soldier.hashCode() : 0;
        result = 31 * result + (rang != null ? rang.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ordinary{" +
                "soldier=" + soldier +
                ", rang=" + rang +
                '}';
    }
}
