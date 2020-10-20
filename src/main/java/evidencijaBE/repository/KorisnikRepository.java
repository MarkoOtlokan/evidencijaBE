package evidencijaBE.repository;

import evidencijaBE.model.KorisnikEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface KorisnikRepository extends JpaRepository<KorisnikEntity, Long> {


    KorisnikEntity findByKorisnickoIme(String korisnickoIme);
}
