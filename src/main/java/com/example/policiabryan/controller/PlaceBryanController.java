    package com.example.policiabryan.controller;

    import java.util.List;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.DeleteMapping;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PatchMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.PutMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    import com.example.policiabryan.entities.PlaceBryan;
    import com.example.policiabryan.service.PlaceBryanService;


    @RestController
    @RequestMapping("/api/v4")
    public class PlaceBryanController {
        @Autowired
        private PlaceBryanService placeService;

        @PostMapping(value ="/place")
        public PlaceBryan findById(@RequestBody PlaceBryan entity){
            return placeService.save(entity);
        }

        @GetMapping(value ="/place/{id}")
        public PlaceBryan findById(@PathVariable("id") Long id) {
            return placeService.findById(id);
        }
        @GetMapping(value ="/place")
        public List<PlaceBryan> findAll(){
            return placeService.findAll();
        }


        @PutMapping(value ="/")
        public PlaceBryan update(@RequestBody PlaceBryan entity){
            return placeService.save(entity);
        }

        @PatchMapping(value = "/place/{id}")
        public ResponseEntity<PlaceBryan>  updateById(@PathVariable("id") Long id, @RequestBody PlaceBryan place){
            return  placeService.updateById(id, place);
        }

        @DeleteMapping(value = "/place/{name}")
        public ResponseEntity<Void> deleteByName(@PathVariable("name") String name) {
            return placeService.deleteByName(name);
        }
        }