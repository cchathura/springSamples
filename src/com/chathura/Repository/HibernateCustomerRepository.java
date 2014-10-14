package com.chathura.Repository;

import java.util.ArrayList;
import java.util.List;

import com.chathura.model.Customer;

public class HibernateCustomerRepository implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.chathura.Repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {

		Customer customer = new Customer();
		customer.setFirstName("chathura");
		customer.setLastName("prasad");
		List<Customer> list = new ArrayList<>();
		list.add(customer);
		return list;
	}
}
