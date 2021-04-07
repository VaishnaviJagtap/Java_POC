package e_commerce.poc.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import e_commerce.poc.entity.*;

@Repository
public interface RoleRepository extends CrudRepository<RoleDao, Long> {
	Optional<RoleDao> findByName(ERole name);
}
