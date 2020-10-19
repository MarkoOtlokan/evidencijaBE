package evidencijaBE.repository;

import evidencijaBE.model.ProizvodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProizvodRepository  extends JpaRepository<ProizvodEntity, Integer> {
    public List<ProizvodEntity> findAllByKorisnikId(Integer id);
}
