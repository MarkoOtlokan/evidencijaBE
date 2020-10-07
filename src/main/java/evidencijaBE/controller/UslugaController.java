package evidencijaBE.controller;

import evidencijaBE.model.UslugaEntity;
import evidencijaBE.service.UslugaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/service")
@CrossOrigin("*")
public class UslugaController {

    @Autowired
    UslugaService uslugaService;

    @GetMapping
    public ResponseEntity<List<UslugaEntity>> getAll(){
        return ResponseEntity.ok(uslugaService.findAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<UslugaEntity> getById(@PathVariable Integer id){
        return ResponseEntity.ok(uslugaService.findById(id));
    }

    @PostMapping
    public void addUsluga(@Valid @PathVariable UslugaEntity usluga){
        uslugaService.addUsluga(usluga);
    }

    @DeleteMapping
    public void deleteUsluga(@PathVariable Integer id){
        uslugaService.deleteUsluga(id);
    }


}
