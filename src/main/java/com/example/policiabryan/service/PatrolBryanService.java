package com.example.policiabryan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.policiabryan.entities.PatrolBryan;
import com.example.policiabryan.repository.PatrolBryanRepository;

@Service
public class PatrolBryanService {
    @Autowired
    private PatrolBryanRepository patrolRepository;

    //crear
    public PatrolBryan save(PatrolBryan entity){
        return patrolRepository.save(entity);
    }
    //Llamar por id
    public PatrolBryan findById(Long id){
        return patrolRepository.findById(id).orElse(null);
    }

    //llamar a todos
    public List<PatrolBryan> findAll(){
        return patrolRepository.findAll();
    }

    //actualizada parcial

    public ResponseEntity<PatrolBryan> updateById(Long id, PatrolBryan patrolUpdate){
        try{
            PatrolBryan patrolExist = findById(id);
            if(patrolExist == null) return ResponseEntity.notFound().build();

            if (patrolUpdate.getPlate() != null) patrolExist.setPlate(patrolUpdate.getPlate());
            if (patrolUpdate.getCategory() != null) patrolExist.setCategory(patrolUpdate.getCategory());

            PatrolBryan patrolSave = save(patrolExist);
            return ResponseEntity.ok(patrolSave);
         }catch (Exception e){
            return ResponseEntity.internalServerError().build();
         }
    }
    //eliminar
    public void deleteById(Long id){
        patrolRepository.deleteById(id);
    }
}
