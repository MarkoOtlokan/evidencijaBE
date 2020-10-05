package evidencijaBE.service;


import evidencijaBE.model.ProizvodEntity;
import evidencijaBE.repository.ProizvodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProizvodService {

    @Autowired
    ProizvodRepository proizvodRepository;

    public Optional<ProizvodEntity> findProizvodById(Integer id){
        return  proizvodRepository.findById(id);
    }

    public List<ProizvodEntity> findProizvodByUser(Integer id){
        return  proizvodRepository.findAllByKorisnikId(id);
    }

}
