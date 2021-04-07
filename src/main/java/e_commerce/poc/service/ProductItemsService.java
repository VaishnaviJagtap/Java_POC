package e_commerce.poc.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import e_commerce.poc.entity.*;
import e_commerce.poc.repository.*;


@Service
public class ProductItemsService {
	
	@Autowired
	private ProductItemsRepository repo;

	public List<ProductItemsEntity> getProductItems() 
	{
		 List<ProductItemsEntity> list = new ArrayList<>();
			
		 for(ProductItemsEntity customer: repo.findAll())
		 {
			 list.add(customer);
		 }
		
		 	return list;
	}

	public ProductItemsEntity getProductItems(int id) {
		
		return repo.findById(id).get();
	}

	public void addProductItems(ProductItemsEntity listElement) {
		
		repo.save(listElement);
		
	}

	public void updateProductItems(ProductItemsEntity listElement) {
		
		repo.save(listElement);
	}

	public void deleteProductItems(int id) {
		repo.deleteById(id);
		
	}


	

}

