package com.example.policiabryan.service;

import org.springframework.stereotype.Service;

import com.example.policiabryan.entities.PoliceBryan;
import com.example.policiabryan.repository.PoliceBryanRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import java.util.List;



@Service
public class PoliceBryanService {
    @Autowired
    private PoliceBryanRepository policeRepository;

    //crear
    public PoliceBryan save(PoliceBryan entity){
        return policeRepository.save(entity);
    }
    //Llamar por id
    public PoliceBryan findById(Long id){
        return policeRepository.findById(id).orElse(null);
    }

    
    //llamar a todos
    public List<PoliceBryan> findAll(){
        return policeRepository.findAll();
    }

    //actualizada parcial
    public ResponseEntity<PoliceBryan> updateById(Long id, PoliceBryan policeUpdate){
        try{
            PoliceBryan policeExist = findById(id);
            if(policeExist == null) return ResponseEntity.notFound().build();

            if (policeUpdate.getName() != null) policeExist.setName(policeUpdate.getName());
            if (policeUpdate.getLastname() != null) policeExist.setLastname(policeUpdate.getLastname());
            if (policeUpdate.getCharge() != null) policeExist.setCharge(policeUpdate.getCharge());
            PoliceBryan policeSave = save(policeExist);
            return ResponseEntity.ok(policeSave);
         }catch (Exception e){
            return ResponseEntity.internalServerError().build();
         }
    }
    //eliminar
    public void deleteById(Long id){
        policeRepository.deleteById(id);
    }



    
}
