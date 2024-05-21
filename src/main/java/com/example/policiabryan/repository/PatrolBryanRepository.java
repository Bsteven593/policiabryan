package com.example.policiabryan.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.policiabryan.entities.PatrolBryan;

public interface PatrolBryanRepository extends CrudRepository<PatrolBryan, Long> {

    List<PatrolBryan> findAll();
    
}
