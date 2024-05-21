package com.example.policiabryan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.policiabryan.entities.PoliceBryan;
import com.example.policiabryan.service.PoliceBryanService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v2")
public class PoliceBryanController {
    @Autowired
    private PoliceBryanService policeService;

    @PostMapping(value ="/police")
    public PoliceBryan findById(@RequestBody PoliceBryan entity){
        return policeService.save(entity);
    }

    @GetMapping(value ="/police/{id}")
    public PoliceBryan  findById(@PathVariable("id") Long id) {
        return policeService.findById(id);
    }

    @GetMapping(value ="/police")
    public List<PoliceBryan> findAll(){
        return policeService.findAll();
    }

    @PutMapping(value ="/")
    public PoliceBryan update(@RequestBody PoliceBryan entity){
        return policeService.save(entity);
    }

    @PatchMapping(value = "/police/{id}")
    public ResponseEntity<PoliceBryan>  updateById(@PathVariable("id") Long id, @RequestBody PoliceBryan police){
        return  policeService.updateById(id, police);
    }

    @DeleteMapping(value ="/patrols/{id}")
    public void delete(@PathVariable("id") Long id){
    policeService.deleteById(id);
    }
}
