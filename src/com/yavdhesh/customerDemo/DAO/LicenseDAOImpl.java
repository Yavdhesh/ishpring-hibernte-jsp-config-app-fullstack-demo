package com.yavdhesh.customerDemo.DAO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LicenseDAOImpl implements LicenseDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
}
