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
public class CartController {
	
	@Autowired
	CartService service;
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping("/user/cart")
	public List<CartEntity> getCart()
	{
		return service.getCart();
	}
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping("/user/cart/{id}")
	public CartEntity getCart(@PathVariable int id)
	{
		return service.getCart(id); //Using get it will convert from optional to Customer type
	}
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping(method = RequestMethod.POST, value = "/user/cart")
	public void addCart( @RequestBody CartEntity listElement)
	{
		service.addCart(listElement);
	}
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping(method = RequestMethod.PUT, value = "/user/cart/{id}")
	public void updateCart( @RequestBody CartEntity listElement)
	{
		service.updateCart(listElement);
	}
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping(method = RequestMethod.DELETE, value = "/user/cart/{id}")
	public void deleteCart(@PathVariable int id)
	{
		service.deleteCart(id);
		
	}

	
}



