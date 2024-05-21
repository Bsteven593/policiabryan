package com.example.policiabryan.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.policiabryan.entities.PoliceBryan;

public interface PoliceBryanRepository extends CrudRepository<PoliceBryan, Long> {
    List<PoliceBryan> findAll();
}
