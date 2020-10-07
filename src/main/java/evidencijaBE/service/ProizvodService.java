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

    public ProizvodEntity findProizvodById(Integer id){
        Optional<ProizvodEntity> proizvod = proizvodRepository.findById(id);
        ProizvodEntity tmpProizvod = new ProizvodEntity();

        if(proizvod.isPresent()){
            tmpProizvod.setIdProizvod(proizvod.get().getIdProizvod());
            tmpProizvod.setKorisnikId(proizvod.get().getIdProizvod());
            tmpProizvod.setCena(proizvod.get().getCena());
            tmpProizvod.setNapomena(proizvod.get().getNapomena());
            tmpProizvod.setNaziv(proizvod.get().getNaziv());
            tmpProizvod.setTimeStamp(proizvod.get().getTimeStamp());
        }

        return  tmpProizvod;
    }

    public List<ProizvodEntity> findProizvodByUser(Integer id){
        return  proizvodRepository.findAllByKorisnikId(id);
    }

    public List<ProizvodEntity> getAll() {
        return proizvodRepository.findAll();
    }

    public ProizvodEntity addProizvod(ProizvodEntity proizvodEntity) {
        return  proizvodRepository.save(proizvodEntity);
    }

    public void deleteProizvod(Integer id){
        proizvodRepository.deleteById(id);
    }
}
