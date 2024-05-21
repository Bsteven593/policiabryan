package com.example.policiabryan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.example.policiabryan.entities.PlaceBryan;
import com.example.policiabryan.repository.PlaceBryanRepository;

@Service
public class PlaceBryanService {
    @Autowired
    private PlaceBryanRepository placeBryanRepository;

    //crear
    public PlaceBryan save(PlaceBryan entity){
        return placeBryanRepository.save(entity);
    }

     //Llamar por id
    public PlaceBryan findById(Long id){
        return placeBryanRepository.findById(id).orElse(null);
    }

    //llamar a todos
    public List<PlaceBryan> findAll(){
        return placeBryanRepository.findAll();
    }

    
    //actualizada parcial

    public ResponseEntity<PlaceBryan> updateById(Long id, PlaceBryan placeUpdate){
        try{
            PlaceBryan placeExist = findById(id);
            if(placeExist == null) return ResponseEntity.notFound().build();

            if (placeUpdate.getRange() != null) placeExist.setRange(placeUpdate.getRange()) ;
            if (placeUpdate.getDate() != null) placeExist.setDate(placeUpdate.getDate()) ;
            if (placeUpdate.getStade() != null) placeExist.setStade(placeUpdate.getStade()) ;
            if (placeUpdate.getName() != null) placeExist.setName(placeUpdate.getName()) ;

            PlaceBryan placeSave = save(placeExist);
            return ResponseEntity.ok(placeSave);
         }catch (Exception e){
            return ResponseEntity.internalServerError().build();
         }
    }
    public ResponseEntity<Void> deleteByName(String name){
        PlaceBryan place = placeBryanRepository.findByName(name);
        if (place != null) {
            placeBryanRepository.delete(place);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

   

    
}
