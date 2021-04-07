package e_commerce.poc.controller;



import java.lang.reflect.Method;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import e_commerce.poc.service.*;
import e_commerce.poc.entity.*;


@RestController
public class CategoryController {
	
	@Autowired
	CategoryService service;
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping("/admin/category")
	public List<CategoryEntity> getCart()
	{
		return service.getCategory();
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping("/admin/category/{id}")
	public CategoryEntity getCategory(@PathVariable int id)
	{
		return service.getCategory(id); //Using get it will convert from optional to Customer type
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST, value = "/admin/category")
	public void addCategory( @RequestBody CategoryEntity listElement)
	{
		service.addCategory(listElement);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.PUT, value = "/admin/category/{id}")
	public void updateCategory( @RequestBody CategoryEntity listElement)
	{
		service.updateCategory(listElement);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.DELETE, value = "/admin/category/{id}")
	public void deleteCategory(@PathVariable int id)
	{
		service.deleteCategory(id);
		
	}

	
}



