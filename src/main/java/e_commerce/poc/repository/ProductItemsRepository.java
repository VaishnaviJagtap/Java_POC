package e_commerce.poc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import e_commerce.poc.entity.ProductItemsEntity;

@Repository
public interface ProductItemsRepository extends CrudRepository<ProductItemsEntity,Integer>{

}
