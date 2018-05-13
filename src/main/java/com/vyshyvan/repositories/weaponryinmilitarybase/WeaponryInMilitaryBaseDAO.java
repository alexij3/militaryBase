package com.vyshyvan.repositories.weaponryinmilitarybase;

import com.vyshyvan.model.WeaponryInMilitaryBase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponryInMilitaryBaseDAO extends CrudRepository<WeaponryInMilitaryBase, Integer>{

}

