package org.fanatic.repository;

import java.util.*;

import org.fanatic.model.Customer;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public class HybernateCustomerRepository implements customerRepository {

	
	public List<Customer> findAll()
	{
		List<Customer> customers = new ArrayList <Customer>();
		Customer c = new Customer();
		Customer c1 = new Customer();
		c.setFirstName("Vivek");
		c.setLastName("Kumar");
		c1.setFirstName("Love");
		c1.setLastName("Kumar");
		customers.add(c);
		customers.add(c1);
		return customers;
	}

	public List<Customer> findAll2() {
		// TODO Auto-generated method stub
		return null;
	}
}
