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
		c.setFirstName("Arun");
		c.setLastName("Pratap");
		c1.setFirstName("Ram");
		c1.setLastName("Sir");
		customers.add(c);
		customers.add(c1);
		return customers;
	}

	public List<Customer> findAll2() {
		// TODO Auto-generated method stub
		return null;
	}
}
