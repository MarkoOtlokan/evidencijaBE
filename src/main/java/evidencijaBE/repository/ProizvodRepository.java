package evidencijaBE.repository;

import evidencijaBE.model.ProizvodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProizvodRepository  extends JpaRepository<ProizvodEntity, Integer> {
    public List<ProizvodEntity> findAllByKorisnikId(Integer id);
}
