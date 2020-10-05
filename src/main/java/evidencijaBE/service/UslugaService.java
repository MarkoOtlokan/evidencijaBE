package evidencijaBE.service;


import evidencijaBE.model.UslugaEntity;
import evidencijaBE.repository.UslugaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UslugaService {

    @Autowired
    UslugaRepository uslugaRepository;

    public Optional<UslugaEntity> findOne(Integer id){
        return uslugaRepository.findById(id);
    }

    public List<UslugaEntity> findByUser(Integer id){
        return uslugaRepository.findAllByKorisnikId(id);
    }

    public List<UslugaEntity> findByProizvod(Integer id){
        return uslugaRepository.findAllByProizvodId(id);
    }

}
