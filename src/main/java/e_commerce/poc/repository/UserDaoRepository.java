package e_commerce.poc.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import e_commerce.poc.entity.UserDao;

@Repository
public interface UserDaoRepository extends CrudRepository<UserDao, Integer>{
	Optional<UserDao> findByUsername(String username);
	Boolean existsByUsername(String username);

}