package com.example.policiabryan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.policiabryan.entities.WeaponBryan;
import com.example.policiabryan.service.WeaponBryanService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v3")
public class WeaponBryanController {
    @Autowired
    private WeaponBryanService weaponService;

    @PostMapping(value ="/weapons")
    public WeaponBryan findById(@RequestBody WeaponBryan entity){
        return weaponService.save(entity);
    }

    @GetMapping(value ="/weapons/{id}")
    public WeaponBryan findById(@PathVariable("id") Long id) {
        return weaponService.findById(id);
    }
    @GetMapping(value ="/weapons")
    public List<WeaponBryan> findAll(){
        return weaponService.findAll();
    }


     @PutMapping(value ="/")
    public WeaponBryan update(@RequestBody WeaponBryan entity){
        return weaponService.save(entity);
    }

    @PatchMapping(value = "/weapons/{id}")
    public ResponseEntity<WeaponBryan>  updateById(@PathVariable("id") Long id, @RequestBody WeaponBryan weapon){
        return  weaponService.updateById(id, weapon);
    }

     @DeleteMapping(value ="/weapons/{id}")
    public void delete(@PathVariable("id") Long id){
    weaponService.deleteById(id);
}
}
