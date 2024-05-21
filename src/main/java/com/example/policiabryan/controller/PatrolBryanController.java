package com.example.policiabryan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.policiabryan.entities.PatrolBryan;
import com.example.policiabryan.service.PatrolBryanService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1")
public class PatrolBryanController {
    @Autowired
    private PatrolBryanService patrolService;

    @PostMapping(value ="/patrols")
    public PatrolBryan findById(@RequestBody PatrolBryan entity){
        return patrolService.save(entity);
    }

    @GetMapping(value ="/patrols/{id}")
    public PatrolBryan findById(@PathVariable("id") Long id) {
        return patrolService.findById(id);
    }
    @GetMapping(value ="/patrols")
    public List<PatrolBryan> findAll(){
        return patrolService.findAll();
    }


     @PutMapping(value ="/")
    public PatrolBryan update(@RequestBody PatrolBryan entity){
        return patrolService.save(entity);
    }

    @PatchMapping(value = "/patrols/{id}")
    public ResponseEntity<PatrolBryan>  updateById(@PathVariable("id") Long id, @RequestBody PatrolBryan patrol){
        return  patrolService.updateById(id, patrol);
    }

     @DeleteMapping(value ="/patrols/{id}")
    public void delete(@PathVariable("id") Long id){
    patrolService.deleteById(id);
    }
       
   
    
      }





