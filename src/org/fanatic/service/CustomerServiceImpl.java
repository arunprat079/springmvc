package org.fanatic.service;
import java.util.List;

import org.fanatic.model.Customer;
import org.fanatic.repository.customerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements customerService {
@Autowired
	customerRepository customerRepository;
	
//	public CustomerServiceImpl(){
//		
//		System.out.println("We are using default Constructor.");
//	}
//
//
//	public CustomerServiceImpl(HybernateCustomerRepository customerRepository) {
//		
//		System.out.println("We are using Constructor Injection...");
//		this.customerRepository = customerRepository;
//	}
//
//	public void setCustomerRepository(HybernateCustomerRepository customerRepository) {
//		System.out.println("We are using Setter Injection");
//		this.customerRepository = customerRepository;
//	}

	public List<Customer> findAll()
	{
		return customerRepository.findAll();
	}


	
}
