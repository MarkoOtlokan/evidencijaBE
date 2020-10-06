package evidencijaBE.service;


import evidencijaBE.model.KlijentEntity;
import evidencijaBE.repository.KlijentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KlijentService {

    @Autowired
    KlijentRepository klijentRepository;

    public KlijentEntity findKlijentById(Integer id){
        Optional<KlijentEntity> klijent = klijentRepository.findById(id);
        KlijentEntity tmpKlijent = new KlijentEntity();
        if(klijent.isPresent()){
            tmpKlijent.setIme(klijent.get().getIme());
            tmpKlijent.setPrezime(klijent.get().getPrezime());
            tmpKlijent.setIdKlijent(klijent.get().getIdKlijent());
            tmpKlijent.setAktivan(klijent.get().getAktivan());
            tmpKlijent.setNapomena(klijent.get().getNapomena());
            tmpKlijent.setTimeStamp(klijent.get().getTimeStamp());
        }
        return tmpKlijent;
    }

    public List<KlijentEntity> findAll() {
        return klijentRepository.findAll();
    }

    public KlijentEntity create(KlijentEntity klijentEntity) {
        return klijentEntity;
    }

    public void delete(Integer id) {
        klijentRepository.deleteById(id);
    }
}
