package evidencijaBE.repository;

import evidencijaBE.model.RolesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.management.relation.Role;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RolesEntity, Integer> {
    Optional<Role> findByErole(String erole);
}
