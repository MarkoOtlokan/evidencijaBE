package evidencijaBE.service;


import evidencijaBE.model.KlijentEntity;
import evidencijaBE.repository.KlijentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KlijentService {

    @Autowired
    KlijentRepository klijentRepository;

    public Optional<KlijentEntity> findKlijentById(Integer id){
        return klijentRepository.findById(id);
    }

}
