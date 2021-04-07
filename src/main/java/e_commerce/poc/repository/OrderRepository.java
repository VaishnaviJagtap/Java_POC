package e_commerce.poc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import e_commerce.poc.entity.OrderEntity;

@Repository
public interface OrderRepository extends CrudRepository<OrderEntity,Integer>{

}
