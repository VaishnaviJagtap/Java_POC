package e_commerce.poc.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import e_commerce.poc.entity.*;
import e_commerce.poc.repository.*;


@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repo;

	public List<CategoryEntity> getCategory() 
	{
		 List<CategoryEntity> list = new ArrayList<>();
			
		 for(CategoryEntity customer: repo.findAll())
		 {
			 list.add(customer);
		 }
		
		 	return list;
	}

	public CategoryEntity getCategory(int id) {
		
		return repo.findById(id).get();
	}

	public void addCategory(CategoryEntity listElement) {
		
		repo.save(listElement);
		
	}

	public void updateCategory(CategoryEntity listElement) {
		
		repo.save(listElement);
	}

	public void deleteCategory(int id) {
		repo.deleteById(id);
		
	}


	

}

