package com.vyshyvan.datastorage;

import com.vyshyvan.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class DataStorage {
    public static List<Army> armies = new ArrayList<>(
            Arrays.asList(
                    new Army(1, "AB1", "Армія №1"),
                    new Army(2, "AB2", "Армія №2"),
                    new Army(3, "AB3", "Армія №3"),
                    new Army(4, "AB4", "Армія №4"),
                    new Army(5, "AB5", "Армія №5"),
                    new Army(6, "AB6", "Армія №6"),
                    new Army(7, "AB7", "Армія №7"),
                    new Army(8, "AB8", "Армія №8"),
                    new Army(9, "AB9", "Армія №9"),
                    new Army(10, "AB10", "Армія №10"),
                    new Army(11, "AB11", "Армія №11"),
                    new Army(12, "AB12", "Армія №12"),
                    new Army(13, "AB13", "Армія №13"),
                    new Army(14, "AB14", "Армія №14"),
                    new Army(15, "AB15", "Армія №15")
            )
    );

    public static List<Brigade> brigades = new ArrayList<>(
            Arrays.asList(
                    new Brigade(1, "BG1", "Бригада №1"),
                    new Brigade(2, "BG2", "Бригада №2"),
                    new Brigade(3, "BG3", "Бригада №3"),
                    new Brigade(4, "BG4", "Бригада №4"),
                    new Brigade(5, "BG5", "Бригада №5"),
                    new Brigade(6, "BG6", "Бригада №6"),
                    new Brigade(7, "BG7", "Бригада №7"),
                    new Brigade(8, "BG8", "Бригада №8"),
                    new Brigade(9, "BG9", "Бригада №9"),
                    new Brigade(10, "BG10", "Бригада №10"),
                    new Brigade(11, "BG11", "Бригада №11"),
                    new Brigade(12, "BG12", "Бригада №12"),
                    new Brigade(13, "BG13", "Бригада №13"),
                    new Brigade(14, "BG14", "Бригада №14"),
                    new Brigade(15, "BG15", "Бригада №15")
            )
    );

    public static List<Buildings> buildings = new ArrayList<>(
            Arrays.asList(
                    new Buildings(1, "Будівля 1"),
                    new Buildings(2, "Будівля 2"),
                    new Buildings(3, "Будівля 3"),
                    new Buildings(4, "Будівля 4"),
                    new Buildings(5, "Будівля 5"),
                    new Buildings(6, "Будівля 6"),
                    new Buildings(7, "Будівля 7"),
                    new Buildings(8, "Будівля 8"),
                    new Buildings(9, "Будівля 9"),
                    new Buildings(10, "Будівля 10"),
                    new Buildings(11, "Будівля 11"),
                    new Buildings(12, "Будівля 12"),
                    new Buildings(13, "Будівля 13"),
                    new Buildings(14, "Будівля 14"),
                    new Buildings(15, "Будівля 15")
            )
    );

    public static List<Corps> corps = new ArrayList<>(
            Arrays.asList(
                    new Corps(1, "CPS1", "Корпус №1"),
                    new Corps(2, "CPS2", "Корпус №2"),
                    new Corps(3, "CPS3", "Корпус №3"),
                    new Corps(4, "CPS4", "Корпус №4"),
                    new Corps(5, "CPS5", "Корпус №5"),
                    new Corps(6, "CPS6", "Корпус №6"),
                    new Corps(7, "CPS7", "Корпус №7"),
                    new Corps(8, "CPS8", "Корпус №8"),
                    new Corps(9, "CPS9", "Корпус №9"),
                    new Corps(10, "CPS1", "Корпус №10"),
                    new Corps(11, "CPS1", "Корпус №11"),
                    new Corps(12, "CPS1", "Корпус №12"),
                    new Corps(13, "CPS1", "Корпус №13"),
                    new Corps(14, "CPS1", "Корпус №14"),
                    new Corps(15, "CPS1", "Корпус №15")
            )
    );

    public static List<Division> divisions = new ArrayList<>(
            Arrays.asList(
                    new Division(1, "DV1", "Дивізія №1"),
                    new Division(2, "DV2", "Дивізія №2"),
                    new Division(3, "DV3", "Дивізія №3"),
                    new Division(4, "DV4", "Дивізія №4"),
                    new Division(5, "DV5", "Дивізія №5"),
                    new Division(6, "DV6", "Дивізія №6"),
                    new Division(7, "DV7", "Дивізія №7"),
                    new Division(8, "DV8", "Дивізія №8"),
                    new Division(9, "DV9", "Дивізія №9"),
                    new Division(10, "DV10", "Дивізія №10"),
                    new Division(11, "DV11", "Дивізія №11"),
                    new Division(12, "DV12", "Дивізія №12"),
                    new Division(13, "DV13", "Дивізія №13"),
                    new Division(14, "DV14", "Дивізія №14"),
                    new Division(15, "DV15", "Дивізія №15")
            )
    );

    public static List<Specialty> specialties = new ArrayList<>(
            Arrays.asList(
                    new Specialty(1, "C1", "Спец 1"),
                    new Specialty(2, "C2", "Спец 2"),
                    new Specialty(3, "C3", "Спец 3"),
                    new Specialty(4, "C4", "Спец 4"),
                    new Specialty(5, "C5", "Спец 5"),
                    new Specialty(6, "C6", "Спец 6"),
                    new Specialty(7, "C7", "Спец 7"),
                    new Specialty(8, "C8", "Спец 8"),
                    new Specialty(9, "C9", "Спец 9"),
                    new Specialty(10, "C10", "Спец 10")
            )
    );

    public static List<Soldier> soldiers = new ArrayList<>(
            Arrays.asList(
                    new Soldier(1, "Бузілов О.В.", 30, 1, specialties.get(0)),
                    new Soldier(2, "Вишиван В. А.", 31, 1, specialties.get(1)),
                    new Soldier(3, "Будько Б. Б.", 32, 2, specialties.get(2)),
                    new Soldier(4, "Ступка Б. Б.", 33, 3, specialties.get(3)),
                    new Soldier(5, "Максимович М. М.", 34, 4, specialties.get(4)),
                    new Soldier(6, "Дудко Д. Д.", 35, 5, specialties.get(0)),
                    new Soldier(7, "Мишко С. С.", 36, 6, specialties.get(1)),
                    new Soldier(8, "Сергійко С. С.", 37, 7, specialties.get(2)),
                    new Soldier(9, "Соловей С. С.", 38, 8, specialties.get(3)),
                    new Soldier(10, "Диман Д. Д.", 39, 9, specialties.get(4)),
                    new Soldier(11, "Петренко П. П.", 49, 9, specialties.get(4)),
                    new Soldier(12, "Береза С. А.", 59, 9, specialties.get(4)),
                    new Soldier(13, "Верба Д. О.", 39, 9, specialties.get(4)),
                    new Soldier(14, "Дуб Д. Д.", 29, 9, specialties.get(4)),
                    new Soldier(15, "Дим Д. Д.", 39, 9, specialties.get(4))
    ));

    public static List<MilitaryBase> militaryBases = new ArrayList<>(
            Arrays.asList(new MilitaryBase(1, "Частина 1", armies.get(0), divisions.get(0), null, null, buildings.get(0), soldiers.get(0)),
                    new MilitaryBase(1, "Частина 1", armies.get(0), divisions.get(0), null, null, buildings.get(1), soldiers.get(0)),
                    new MilitaryBase(2, "Частина 2", armies.get(0), divisions.get(0), null, null, buildings.get(0), soldiers.get(1)),
                    new MilitaryBase(3, "Частина 3", armies.get(1), divisions.get(1), null, null, buildings.get(1), soldiers.get(2)),
                    new MilitaryBase(4, "Частина 4", armies.get(2), divisions.get(1), null, null, buildings.get(1), soldiers.get(3)),
                    new MilitaryBase(5, "Частина 5", armies.get(3), null, getCorps().get(2), null, buildings.get(2), soldiers.get(4)),
                    new MilitaryBase(6, "Частина 6", armies.get(4), null, getCorps().get(2), null, buildings.get(2), soldiers.get(5)),
                    new MilitaryBase(7, "Частина 7", armies.get(5), null, getCorps().get(3), null, buildings.get(2), soldiers.get(6)),
                    new MilitaryBase(8, "Частина 8", armies.get(6), null, getCorps().get(3), null, buildings.get(2), soldiers.get(7)),
                    new MilitaryBase(9, "Частина 9", armies.get(7), null, null, getBrigades().get(4), buildings.get(3), soldiers.get(8)),
                    new MilitaryBase(10, "Частина 10", armies.get(8), null, null, getBrigades().get(4), buildings.get(3), soldiers.get(9)),
                    new MilitaryBase(11, "Частина 11", armies.get(9), null, getCorps().get(5), null, buildings.get(3), soldiers.get(9)),
                    new MilitaryBase(12, "Частина 12", armies.get(9), null, getCorps().get(5), null, buildings.get(4), soldiers.get(9)),
                    new MilitaryBase(13, "Частина 13", armies.get(9), divisions.get(6), null, null, buildings.get(5), soldiers.get(9)),
                    new MilitaryBase(14, "Частина 14", armies.get(9), divisions.get(6), null, null, buildings.get(6), soldiers.get(9)),
                    new MilitaryBase(15, "Частина 15", armies.get(10), null, getCorps().get(6), null, buildings.get(7), soldiers.get(9))
    ));

    public static List<Squadron> squadrons = new ArrayList<>(
            Arrays.asList(
                    new Squadron(1, "SOD1", "Рота 1", militaryBases.get(0)),
                    new Squadron(2, "SOD2", "Рота 2", militaryBases.get(0)),
                    new Squadron(3, "SOD3", "Рота 3", militaryBases.get(0)),
                    new Squadron(4, "SOD4", "Рота 4", militaryBases.get(1)),
                    new Squadron(5, "SOD5", "Рота 5", militaryBases.get(1)),
                    new Squadron(6, "SOD6", "Рота 6", militaryBases.get(1)),
                    new Squadron(7, "SOD7", "Рота 7", militaryBases.get(2)),
                    new Squadron(8, "SOD8", "Рота 8", militaryBases.get(2)),
                    new Squadron(9, "SOD9", "Рота 9", militaryBases.get(2)),
                    new Squadron(10, "SOD10", "Рота 10", militaryBases.get(3)),
                    new Squadron(11, "SOD11", "Рота 11", militaryBases.get(3)),
                    new Squadron(12, "SOD12", "Рота 12", militaryBases.get(3)),
                    new Squadron(13, "SOD13", "Рота 13", militaryBases.get(4)),
                    new Squadron(14, "SOD14", "Рота 14", militaryBases.get(4)),
                    new Squadron(15, "SOD15", "Рота 15", militaryBases.get(4))
            )
    );


    public static List<Platoon> platoons = new ArrayList<>(
            Arrays.asList(
                    new Platoon(1, "PLT1", "Взвод 1", squadrons.get(0)),
                    new Platoon(2, "PLT2", "Взвод 2", squadrons.get(0)),
                    new Platoon(3, "PLT3", "Взвод 3", squadrons.get(0)),
                    new Platoon(4, "PLT4", "Взвод 4", squadrons.get(1)),
                    new Platoon(5, "PLT5", "Взвод 5", squadrons.get(1)),
                    new Platoon(6, "PLT6", "Взвод 6", squadrons.get(1)),
                    new Platoon(7, "PLT7", "Взвод 7", squadrons.get(2)),
                    new Platoon(8, "PLT8", "Взвод 8", squadrons.get(2)),
                    new Platoon(9, "PLT9", "Взвод 9", squadrons.get(2)),
                    new Platoon(10, "PLT10", "Взвод 10", squadrons.get(3)),
                    new Platoon(11, "PLT11", "Взвод 11", squadrons.get(3)),
                    new Platoon(12, "PLT12", "Взвод 12", squadrons.get(3)),
                    new Platoon(13, "PLT13", "Взвод 13", squadrons.get(4)),
                    new Platoon(14, "PLT14", "Взвод 14", squadrons.get(4)),
                    new Platoon(15, "PLT15", "Взвод 15", squadrons.get(4))
            )
    );

    public static List<Department> departments = new ArrayList<>(
            Arrays.asList(
                    new Department(1, "DPM1", "Відділення 1", platoons.get(0), soldiers.get(0)),
                    new Department(2, "DPM2", "Відділення 2", platoons.get(1), soldiers.get(0)),
                    new Department(3, "DPM3", "Відділення 3", platoons.get(2), soldiers.get(1)),
                    new Department(4, "DPM4", "Відділення 4", platoons.get(3), soldiers.get(2)),
                    new Department(5, "DPM5", "Відділення 5", platoons.get(4), soldiers.get(3)),
                    new Department(6, "DPM6", "Відділення 6", platoons.get(5), soldiers.get(4)),
                    new Department(7, "DPM7", "Відділення 7", platoons.get(6), soldiers.get(5)),
                    new Department(8, "DPM8", "Відділення 8", platoons.get(7), soldiers.get(6)),
                    new Department(9, "DPM9", "Відділення 9", platoons.get(8), soldiers.get(7)),
                    new Department(10, "DPM10", "Відділення 10", platoons.get(9), soldiers.get(8))
            )
    );

    public static List<Transport> transport = new ArrayList<>(
            Arrays.asList(
                    new Transport(1, TransportType.БМП, "Кул БМП", 6, 3),
                    new Transport(2, TransportType.БМП, "Еназа БМП", 6, 4),
                    new Transport(3, TransportType.БМП, "Супер БМП", 6, 4),
                    new Transport(4, TransportType.Тягач, "Файний тягач", 1, 0),
                    new Transport(5, TransportType.Тягач, "Топ тягач", 2, 0),
                    new Transport(6, TransportType.Автотранспорт, "Просто авто", 4, 0),
                    new Transport(7, TransportType.Автотранспорт, "Топ авто", 8, 2)
            )
    );

    public static List<TransportInMilitaryBase> transportInMilitaryBases = new ArrayList<>(
            Arrays.asList(
                new TransportInMilitaryBase(militaryBases.get(0), transport.get(0), 3),
                new TransportInMilitaryBase(militaryBases.get(0), transport.get(1), 5),
                new TransportInMilitaryBase(militaryBases.get(0), transport.get(3), 1),
                new TransportInMilitaryBase(militaryBases.get(0), transport.get(6), 3),
                new TransportInMilitaryBase(militaryBases.get(1), transport.get(0), 1),
                new TransportInMilitaryBase(militaryBases.get(1), transport.get(1), 3),
                new TransportInMilitaryBase(militaryBases.get(2), transport.get(0), 1),
                new TransportInMilitaryBase(militaryBases.get(2), transport.get(5), 3),
                new TransportInMilitaryBase(militaryBases.get(2), transport.get(6), 1),
                new TransportInMilitaryBase(militaryBases.get(3), transport.get(0), 3)
            )
    );

    public static List<Weaponry> weaponry = new ArrayList<>(
            Arrays.asList(
                    new Weaponry(1, WeaponryType.Карабін, "Карабінчик 1", "7.62", "Ні"),
                    new Weaponry(2, WeaponryType.Карабін, "Топ карабін", "7.62", "Ні"),
                    new Weaponry(3, WeaponryType.Автомат, "АК47", "7.62", "Ні"),
                    new Weaponry(4, WeaponryType.Автомат, "M4A1", "5.56", "Ні"),
                    new Weaponry(5, WeaponryType.Автомат, "M4A1-S", "5.56", "Так"),
                    new Weaponry(6, WeaponryType.Артилерія, "Крута артилерія", null, "Ні"),
                    new Weaponry(7, WeaponryType.Артилерія, "Інша артилерія", null, "Ні"),
                    new Weaponry(8, WeaponryType.Артилерія, "Топова артилерія", null, "Ні"),
                    new Weaponry(9, WeaponryType.Ракети, "Анріл ракети", null, "Ні"),
                    new Weaponry(10, WeaponryType.Ракети, "Такі ракети", null, "Ні"),
                    new Weaponry(11, WeaponryType.Ракети, "Зовсім інші ракети", null, "Ні"),
                    new Weaponry(12, WeaponryType.Ракети, "Трохи інші ракети", null, "Ні")
            )
    );


    public static List<Officers> officers = new ArrayList<>(
            Arrays.asList(
                    new Officers(soldiers.get(0), Rang.Генерал, "2000-01-01", "2018-03-25"),
                    new Officers(soldiers.get(1), Rang.Капітан, "2000-01-01", null),
                    new Officers(soldiers.get(2), Rang.Майор, "2000-01-01", null),
                    new Officers(soldiers.get(3), Rang.Полковник, "2000-01-01", null),
                    new Officers(soldiers.get(4), Rang.Полковник, "2000-01-01", null),
                    new Officers(soldiers.get(5), Rang.Полковник, "2000-01-01", null),
                    new Officers(soldiers.get(6), Rang.Полковник, "2000-01-01", null),
                    new Officers(soldiers.get(7), Rang.Полковник, "2000-01-01", null),
                    new Officers(soldiers.get(8), Rang.Полковник, "2000-01-01", null),
                    new Officers(soldiers.get(9), Rang.Полковник, "2000-01-01", null)
            )
    );


    public static List<WeaponryInMilitaryBase> weaponryInMilitaryBases = new ArrayList<>(
            Arrays.asList(
                    new WeaponryInMilitaryBase(militaryBases.get(0), weaponry.get(0), 300),
                    new WeaponryInMilitaryBase(militaryBases.get(0), weaponry.get(1), 123),
                    new WeaponryInMilitaryBase(militaryBases.get(0), weaponry.get(2), 432),
                    new WeaponryInMilitaryBase(militaryBases.get(0), weaponry.get(5), 200),
                    new WeaponryInMilitaryBase(militaryBases.get(1), weaponry.get(2), 300),
                    new WeaponryInMilitaryBase(militaryBases.get(1), weaponry.get(5), 700),
                    new WeaponryInMilitaryBase(militaryBases.get(1), weaponry.get(6), 300),
                    new WeaponryInMilitaryBase(militaryBases.get(2), weaponry.get(0), 600),
                    new WeaponryInMilitaryBase(militaryBases.get(2), weaponry.get(2), 300),
                    new WeaponryInMilitaryBase(militaryBases.get(3), weaponry.get(3), 300)
            )
    );

    public static List<Ordinary> ordinaries = new ArrayList<>(
            Arrays.asList(
                    new Ordinary(soldiers.get(10), Rang.Рядовий),
                    new Ordinary(soldiers.get(11), Rang.Рядовий),
                    new Ordinary(soldiers.get(12), Rang.Рядовий),
                    new Ordinary(soldiers.get(13), Rang.Рядовий),
                    new Ordinary(soldiers.get(14), Rang.Рядовий)
            )

    );

    public static List<Officers> getOfficers() {
        return officers;
    }

    public static List<Ordinary> getOrdinaries() {
        return ordinaries;
    }

    public static List<Brigade> getBrigades() {
        return brigades;
    }

    public static List<Buildings> getBuildings() {
        return buildings;
    }

    public static List<Corps> getCorps() {
        return corps;
    }

    public static List<Division> getDivisions() {
        return divisions;
    }

    public static List<Soldier> getSoldiers() {
        return soldiers;
    }

    public static List<MilitaryBase> getMilitaryBases() {
        return militaryBases;
    }

    public static List<Squadron> getSquadrons() {
        return squadrons;
    }

    public static List<Platoon> getPlatoons() {
        return platoons;
    }

    public static List<Department> getDepartments() {
        return departments;
    }

    public static List<Army> getArmies() {
        return armies;
    }

    public static List<Transport> getTransport() {
        return transport;
    }

    public static List<TransportInMilitaryBase> getTransportInMilitaryBases() {
        return transportInMilitaryBases;
    }

    public static List<Weaponry> getWeaponry() {
        return weaponry;
    }

    public static List<Specialty> getSpecialties() {
        return specialties;
    }

    public static List<WeaponryInMilitaryBase> getWeaponryInMilitaryBases() {
        return weaponryInMilitaryBases;
    }
}
