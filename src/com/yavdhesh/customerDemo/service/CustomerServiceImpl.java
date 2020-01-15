package com.yavdhesh.customerDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yavdhesh.customerDemo.DAO.CustomerDAO;
import com.yavdhesh.customerDemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	@Transactional
	@Override
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Transactional
	@Override
	public void jodoCustomer(Customer cust) {
		
		customerDAO.jodoCustomer(cust);
		
	}

	@Transactional
	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer(id);
	}

	@Transactional
	@Override
	public void GraahakJaankaariParvivartan(Customer customer) {
		
		customerDAO.GraahakJaankaariParvivartan(customer);
		
	}

	@Transactional
	@Override
	public void graahakHataao(int id) {

		customerDAO.graahakHataao(id);
		
	}
	
}
