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

    public UslugaEntity findOne(Integer id){
        Optional<UslugaEntity> usluga = uslugaRepository.findById(id);
        UslugaEntity tmpUsluga = new UslugaEntity();
        if(usluga.isPresent()){
            tmpUsluga.setIdUsluga(usluga.get().getIdUsluga());
            tmpUsluga.setKlijentId(usluga.get().getKlijentId());
            tmpUsluga.setKorisnikId(usluga.get().getKorisnikId());
            tmpUsluga.setProizvodId(usluga.get().getProizvodId());
            tmpUsluga.setCena(usluga.get().getCena());
            tmpUsluga.setNapomena(usluga.get().getNapomena());
            tmpUsluga.setPlaceno(usluga.get().getPlaceno());
            tmpUsluga.setTimeStamp(usluga.get().getTimeStamp());
        }
        return tmpUsluga;
    }

    public List<UslugaEntity> findByUser(Integer id){
        return uslugaRepository.findAllByKorisnikId(id);
    }

    public List<UslugaEntity> findByProizvod(Integer id){
        return uslugaRepository.findAllByProizvodId(id);
    }

    public UslugaEntity addUsluga(UslugaEntity uslugaEntity){
        return  uslugaRepository.save(uslugaEntity);
    }

}
