package evidencijaBE.repository;

import evidencijaBE.model.EvUser;
import evidencijaBE.model.KlijentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<EvUser, Integer> {
}
