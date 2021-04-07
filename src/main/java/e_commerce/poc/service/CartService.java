package e_commerce.poc.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import e_commerce.poc.entity.*;
import e_commerce.poc.repository.*;


@Service
public class CartService {
	
	@Autowired
	private CartRepository repo;

	public List<CartEntity> getCart() 
	{
		 List<CartEntity> list = new ArrayList<>();
			
		 for(CartEntity customer: repo.findAll())
		 {
			 list.add(customer);
		 }
		
		 	return list;
	}

	public CartEntity getCart(int id) {
		
		return repo.findById(id).get();
	}

	public void addCart(CartEntity listElement) {
		
		repo.save(listElement);
		
	}

	public void updateCart(CartEntity listElement) {
		
		repo.save(listElement);
	}

	public void deleteCart(int id) {
		repo.deleteById(id);
		
	}


	

}

