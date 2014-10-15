package com.chathura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chathura.Repository.CustomerRepository;
import com.chathura.model.Customer;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	//private CustomerRepository customerRepository = new HibernateCustomerRepository();
	@Autowired
	private CustomerRepository customerRepository;
	/*
	public CustomerServiceImpl(){
		System.out.println("no arg contructor");
	}
	public CustomerServiceImpl(CustomerRepository customerRepo){
		System.out.println("contructor call");
		this.customerRepository = customerRepo; 
	}*/
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see com.chathura.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
}
