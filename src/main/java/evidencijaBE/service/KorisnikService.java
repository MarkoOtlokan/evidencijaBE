package evidencijaBE.service;

import evidencijaBE.model.KorisnikEntity;
import evidencijaBE.repository.KorisnikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KorisnikService {

    @Autowired
    KorisnikRepository korisnikRepository;

    public Optional<KorisnikEntity> findById(Long id){
        return korisnikRepository.findById(id);
    }

    public List<KorisnikEntity> findAll(){
        return korisnikRepository.findAll();
    }
}
