package e_commerce.poc.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import e_commerce.poc.entity.*;
import e_commerce.poc.repository.*;


@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repo;

	public List<OrderEntity> getOrder() 
	{
		 List<OrderEntity> list = new ArrayList<>();
			
		 for(OrderEntity customer: repo.findAll())
		 {
			 list.add(customer);
		 }
		
		 	return list;
	}

	public OrderEntity getOrder(int id) {
		
		return repo.findById(id).get();
	}

	public void addOrder(OrderEntity listElement) {
		
		repo.save(listElement);
		
	}

	public void updateOrder(OrderEntity listElement) {
		
		repo.save(listElement);
	}

	public void deleteOrder(int id) {
		repo.deleteById(id);
		
	}


	

}

