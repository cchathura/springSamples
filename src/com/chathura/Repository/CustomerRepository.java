package com.chathura.Repository;

import java.util.List;

import com.chathura.model.Customer;

public interface CustomerRepository {

	public abstract List<Customer> findAll();

}