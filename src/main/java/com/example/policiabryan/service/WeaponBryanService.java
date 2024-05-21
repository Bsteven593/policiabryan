package com.example.policiabryan.service;

import org.springframework.stereotype.Service;

import com.example.policiabryan.entities.WeaponBryan;
import com.example.policiabryan.repository.WeaponBryanRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import java.util.List;



@Service
public class WeaponBryanService {
    @Autowired
    private WeaponBryanRepository weaponRepository;
    
    //crear
    public WeaponBryan save(WeaponBryan entity){
        return weaponRepository.save(entity);
    }
    //Llamar por id

    public WeaponBryan findById(Long id){
        return weaponRepository.findById(id).orElse(null);
    }

    
    //llamar a todos
    public List<WeaponBryan> findAll(){
        return weaponRepository.findAll();
    }

    //actualizada parcial
    public ResponseEntity<WeaponBryan> updateById(Long id, WeaponBryan weaponUpdate){
        try{
            WeaponBryan weaponExist = findById(id);
            if(weaponExist == null) return ResponseEntity.notFound().build();

            if (weaponExist.getName() != null) weaponExist.setName(weaponUpdate.getName());
            if (weaponExist.getCode() != null) weaponExist.setCode(weaponUpdate.getCode());
            if (weaponExist.getPower() != null) weaponExist.setPower(weaponUpdate.getPower());
            WeaponBryan weaponSave = save(weaponExist);
            return ResponseEntity.ok(weaponSave);
         }catch (Exception e){
            return ResponseEntity.internalServerError().build();
         }
    }
    //eliminar
    public void deleteById(Long id){
        weaponRepository.deleteById(id);
    }


}
