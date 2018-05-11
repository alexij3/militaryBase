package com.vyshyvan.model;

public class WeaponryInMilitaryBase {
    private MilitaryBase militaryBase;
    private Weaponry weaponry;
    private int amount;

    public WeaponryInMilitaryBase(MilitaryBase militaryBase, Weaponry weaponry, int amount) {
        this.militaryBase = militaryBase;
        this.weaponry = weaponry;
        this.amount = amount;
    }

    public MilitaryBase getMilitaryBase() {
        return militaryBase;
    }

    public void setMilitaryBase(MilitaryBase militaryBase) {
        this.militaryBase = militaryBase;
    }

    public Weaponry getWeaponry() {
        return weaponry;
    }

    public void setWeaponry(Weaponry weaponry) {
        this.weaponry = weaponry;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WeaponryInMilitaryBase that = (WeaponryInMilitaryBase) o;

        if (amount != that.amount) return false;
        if (militaryBase != null ? !militaryBase.equals(that.militaryBase) : that.militaryBase != null) return false;
        return weaponry != null ? weaponry.equals(that.weaponry) : that.weaponry == null;
    }

    @Override
    public int hashCode() {
        int result = militaryBase != null ? militaryBase.hashCode() : 0;
        result = 31 * result + (weaponry != null ? weaponry.hashCode() : 0);
        result = 31 * result + amount;
        return result;
    }

    @Override
    public String toString() {
        return "WeaponryInMilitaryBase{" +
                "militaryBase=" + militaryBase +
                ", weaponry=" + weaponry +
                ", amount=" + amount +
                '}';
    }
}
