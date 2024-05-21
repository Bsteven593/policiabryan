package com.example.policiabryan.repository;


import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.example.policiabryan.entities.PlaceBryan;




public interface PlaceBryanRepository extends CrudRepository<PlaceBryan, Long> {

    List<PlaceBryan> findAll();
    
    PlaceBryan findByName(String name);;
}
