package evidencijaBE.repository;

import evidencijaBE.model.KorisnikEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface KorisnikRepository extends JpaRepository<KorisnikEntity, Long> {


    KorisnikEntity findByUsername(String username);
}
