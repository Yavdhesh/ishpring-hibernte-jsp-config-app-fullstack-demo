package com.yavdhesh.customerDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yavdhesh.customerDemo.DAO.SalesDAO;

@Service
public class SalesServiceImpl implements SalesService {

	
	@Autowired
	private SalesDAO salesDAO;
}
