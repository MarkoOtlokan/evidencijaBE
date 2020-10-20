package evidencijaBE.repository;

import evidencijaBE.model.KlijentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlijentRepository  extends JpaRepository<KlijentEntity, Integer> {
}
