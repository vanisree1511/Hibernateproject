package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Customer_dto;

public class Customer_dao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	public void save(Customer_dto c) {
		et.begin();
		em.merge(c);
		et.commit();
	}
	public void getCustomerCar(int id) {
		Customer_dto dto=em.find(Customer_dto.class, id);
		if(dto!=null) {
			et.begin();
			if(dto.getCar()!=null) {
				System.out.println(dto+""+dto.getCar());
			}
			et.commit();
		
	}
		else {
			System.out.println("id not found");
		}
}
	public void deleteId(int id) {
		Customer_dto dto=em.find(Customer_dto.class,id);
		Query q=em.createQuery("select a from Customer_dto a");
		List<Customer_dto> c_dto=q.getResultList();
		for(Customer_dto dt:c_dto) {
			if(dt==dto) {
				et.begin();
				dt.setCar(null);
				em.remove(dto);
				et.commit();
				
			}
		}
		
	}
}
