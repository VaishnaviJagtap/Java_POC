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
public class OrderController {
	
	@Autowired
	OrderService service;
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping("/user/order")
	public List<OrderEntity> getOrder()
	{
		return service.getOrder();
	}
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping("/user/order/{id}")
	public OrderEntity getOrder(@PathVariable int id)
	{
		return service.getOrder(id); //Using get it will convert from optional to Customer type
	}
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping(method = RequestMethod.POST, value = "/user/order")
	public void addOrder( @RequestBody OrderEntity listElement)
	{
		service.addOrder(listElement);
	}
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping(method = RequestMethod.PUT, value = "/user/order/{id}")
	public void updateOrder( @RequestBody OrderEntity listElement)
	{
		service.updateOrder(listElement);
	}
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping(method = RequestMethod.DELETE, value = "/user/order/{id}")
	public void deleteOrder(@PathVariable int id)
	{
		service.deleteOrder(id);
		
	}

	
}



