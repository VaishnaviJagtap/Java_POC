package e_commerce.poc.controller;



import java.lang.reflect.Method;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import e_commerce.poc.service.*;
import e_commerce.poc.entity.*;


@RestController
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	
	/*@RequestMapping("/customers")
	public List<CustomerEntity> getCustomers()
	{
		return service.getCustomers();
	}
	
	@RequestMapping("/customers/{id}")
	public CustomerEntity getCutomer(@PathVariable int id)
	{
		return service.getCustomer(id); //Using get it will convert from optional to Customer type
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/customers")
	public void addCustomer( @RequestBody CustomerEntity listElement)
	{
		service.addCustomer(listElement);
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/customers/{id}")
	public void updateCustomer( @RequestBody CustomerEntity listElement)
	{
		service.updateCustomer(listElement);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/customers/{id}")
	public void deleteCustomer(@PathVariable int id)
	{
		service.deleteCustomer(id);
		
	}*/

	
}



