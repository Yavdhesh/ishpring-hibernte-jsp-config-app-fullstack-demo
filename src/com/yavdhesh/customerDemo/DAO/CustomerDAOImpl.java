package com.yavdhesh.customerDemo.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yavdhesh.customerDemo.entity.Customer;


@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	//@Transactional // service me daal diyaa hai
	@Override
	public List<Customer> getCustomers() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Customer> query=session.createQuery("from Customer order by lastName",Customer.class);
		
		List<Customer> list=query.getResultList();
		
		return list;
	}

	@Override
	public void jodoCustomer(Customer cust) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.save(cust);
		
	}

	@Override
	public Customer getCustomer(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Customer customer =session.get(Customer.class, id);
		
		return customer;
	}

	@Override
	public void GraahakJaankaariParvivartan(Customer customer) {
		
		Session session= sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(customer);
		
	}

	@Override
	public void graahakHataao(int id) {
		
		Session session= sessionFactory.getCurrentSession();
		
		Query qery =session.createQuery("delete from Customer where id=:id");
		qery.setParameter("id", id);
		qery.executeUpdate();
		
	}

}
