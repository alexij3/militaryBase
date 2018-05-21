package com.vyshyvan.repositories.weaponryinmilitarybase;

import com.vyshyvan.model.WeaponryInMilitaryBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponryInMilitaryBaseDAO extends JpaRepository<WeaponryInMilitaryBase, Integer> {

}

