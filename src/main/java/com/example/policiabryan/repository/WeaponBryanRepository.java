package com.example.policiabryan.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.policiabryan.entities.WeaponBryan;

public interface WeaponBryanRepository extends CrudRepository<WeaponBryan, Long> {
    List<WeaponBryan> findAll();
    
}
