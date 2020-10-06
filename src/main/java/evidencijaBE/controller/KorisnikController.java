package evidencijaBE.controller;

import evidencijaBE.model.KorisnikEntity;
import evidencijaBE.service.KorisnikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin("*")
public class KorisnikController {

    @Autowired
    KorisnikService korisnikService;

    @GetMapping
    public ResponseEntity<List<KorisnikEntity>> getAll(){
        return ResponseEntity.ok(korisnikService.findAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<KorisnikEntity> getById(@PathVariable Long id){
        return ResponseEntity.ok(korisnikService.findById(id));
    }

    @PostMapping
    public ResponseEntity<KorisnikEntity> addKorisnik(@Valid @RequestBody KorisnikEntity tmpKorisnik){
        return ResponseEntity.ok(korisnikService.create(tmpKorisnik));
    }

    @DeleteMapping{"/{id}"}
    public boolean delete(@PathVariable Long id){
        return korisnikService.delete(id);
    }

}
