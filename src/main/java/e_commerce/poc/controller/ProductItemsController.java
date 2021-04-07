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
public class ProductItemsController {
	
	@Autowired
	ProductItemsService service;
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping("/user/product")
	public List<ProductItemsEntity> getProductItems()
	{
		return service.getProductItems();
	}
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping("/user/product/{id}")
	public ProductItemsEntity getProductItems(@PathVariable int id)
	{
		return service.getProductItems(id); //Using get it will convert from optional to Customer type
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST, value = "/admin/product")
	public void addProductItems( @RequestBody ProductItemsEntity listElement)
	{
		service.addProductItems(listElement);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.PUT, value = "/admin/product/{id}")
	public void updateProductItems( @RequestBody ProductItemsEntity listElement)
	{
		service.updateProductItems(listElement);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.DELETE, value = "/admin/product/{id}")
	public void deleteProductItems(@PathVariable int id)
	{
		service.deleteProductItems(id);
		
	}

	
}



