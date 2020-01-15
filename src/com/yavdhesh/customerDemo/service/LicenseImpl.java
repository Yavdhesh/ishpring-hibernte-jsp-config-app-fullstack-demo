package com.yavdhesh.customerDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yavdhesh.customerDemo.DAO.LicenseDAO;

@Service
public class LicenseImpl implements LicenseService {

	
	@Autowired
	private LicenseDAO licenseDAO;
}
