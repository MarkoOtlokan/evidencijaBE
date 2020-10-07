package evidencijaBE.controller;

import evidencijaBE.model.KlijentEntity;
import evidencijaBE.service.KlijentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/client")
@CrossOrigin("*")
public class KlijentController {

    @Autowired
    KlijentService klijentService;

    @GetMapping
    public ResponseEntity<List<KlijentEntity>> getAll(){
        return ResponseEntity.ok(klijentService.findAll());
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<KlijentEntity> getKlijentById(@PathVariable Integer id){
        return ResponseEntity.ok(klijentService.findKlijentById(id));
    }

    @PostMapping
    public ResponseEntity<KlijentEntity> addKlijent(@Valid @RequestBody KlijentEntity klijentEntity){
        return ResponseEntity.ok(klijentService.create(klijentEntity));
    }

    @DeleteMapping(path = {"/id"})
    public void delete(@PathVariable Integer id){
        klijentService.delete(id);
    }

}
