package com.yavdhesh.customerDemo.service;

import java.util.List;

import com.yavdhesh.customerDemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void jodoCustomer(Customer cust);

	public Customer getCustomer(int id);

	public void GraahakJaankaariParvivartan(Customer customer);

	public void graahakHataao(int id);

}
