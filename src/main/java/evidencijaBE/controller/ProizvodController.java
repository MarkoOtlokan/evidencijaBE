package evidencijaBE.controller;


import evidencijaBE.model.ProizvodEntity;
import evidencijaBE.service.ProizvodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@CrossOrigin("*")
public class ProizvodController {

    @Autowired
    ProizvodService proizvodService;

    @GetMapping
    public ResponseEntity<List<ProizvodEntity>> getAll(){
        return ResponseEntity.ok(proizvodService.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ProizvodEntity> getById(@PathVariable Integer id){
        return ResponseEntity.ok(proizvodService.findProizvodById(id));
    }

    @PostMapping
    public ResponseEntity<ProizvodEntity> addProizvod(@Valid @RequestBody ProizvodEntity proizvodEntity){
        return ResponseEntity.ok(proizvodService.addProizvod(proizvodEntity));
    }

    @DeleteMapping(path = "/{id}")
    public void deleteProizvod(@PathVariable Integer id){
        proizvodService.deleteProizvod(id);
    }



}
