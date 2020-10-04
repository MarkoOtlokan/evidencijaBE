package evidencijaBE.repository;

import evidencijaBE.model.KlijentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KlijentRepository  extends JpaRepository<KlijentEntity, Integer> {
}
