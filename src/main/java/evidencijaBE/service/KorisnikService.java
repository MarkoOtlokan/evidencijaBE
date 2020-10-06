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

    public KorisnikEntity findById(Long id){
        Optional<KorisnikEntity> korisnik = korisnikRepository.findById(id);
        KorisnikEntity tmpKorisnik = new KorisnikEntity();
        if(korisnik.isPresent()){
            tmpKorisnik.setIdKorisnik(korisnik.get().getIdKorisnik());
            tmpKorisnik.setEmail(korisnik.get().getEmail());
            tmpKorisnik.setIme(korisnik.get().getIme());
            tmpKorisnik.setPrezime(korisnik.get().getPrezime());
            tmpKorisnik.setSifra(korisnik.get().getSifra());
            tmpKorisnik.setTimeStamp(korisnik.get().getTimeStamp());
        }

        return tmpKorisnik;
    }

    public List<KorisnikEntity> findAll(){
        return korisnikRepository.findAll();
    }

    public KorisnikEntity create(KorisnikEntity tmpKorisnik) {
    //TODO
        return null;
    }

    public boolean delete(Long id) {
        //TODO
        return false;
    }
}
