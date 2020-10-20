package evidencijaBE.repository;

import evidencijaBE.model.UslugaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UslugaRepository extends JpaRepository<UslugaEntity, Integer> {

    public List<UslugaEntity> findAllByKorisnikId(Integer id);
    public List<UslugaEntity> findAllByKlijentId(Integer id);
    public List<UslugaEntity> findAllByProizvodId(Integer id);
}
