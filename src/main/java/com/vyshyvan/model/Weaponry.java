package com.vyshyvan.model;

public class Weaponry {
    private Integer id;
    private WeaponryType weaponryType;
    private String name;
    private String caliber;
    private String silencer;

    public Weaponry(Integer id, WeaponryType weaponryType, String name, String caliber, String silencer) {
        this.id = id;
        this.weaponryType = weaponryType;
        this.name = name;
        this.caliber = caliber;
        this.silencer = silencer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public WeaponryType getWeaponryType() {
        return weaponryType;
    }

    public void setWeaponryType(WeaponryType weaponryType) {
        this.weaponryType = weaponryType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaliber() {
        return caliber;
    }

    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }

    public String getSilencer() {
        return silencer;
    }

    public void setSilencer(String silencer) {
        this.silencer = silencer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Weaponry weaponry = (Weaponry) o;

        if (id != null ? !id.equals(weaponry.id) : weaponry.id != null) return false;
        if (weaponryType != weaponry.weaponryType) return false;
        if (name != null ? !name.equals(weaponry.name) : weaponry.name != null) return false;
        if (caliber != null ? !caliber.equals(weaponry.caliber) : weaponry.caliber != null) return false;
        return silencer != null ? silencer.equals(weaponry.silencer) : weaponry.silencer == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (weaponryType != null ? weaponryType.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (caliber != null ? caliber.hashCode() : 0);
        result = 31 * result + (silencer != null ? silencer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Weaponry{" +
                "id=" + id +
                ", weaponryType=" + weaponryType +
                ", name='" + name + '\'' +
                ", caliber='" + caliber + '\'' +
                ", silencer='" + silencer + '\'' +
                '}';
    }
}
