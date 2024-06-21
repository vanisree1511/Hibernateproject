package dao;

import java.util.List;

import javax.persistence.*;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Car_dto;
import dto.Customer_dto;

public class Car_dao {
	Customer_dao c_dao=new Customer_dao();
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	public void saveCar(Car_dto dto) {
		et.begin();
		em.merge(dto);
		et.commit();
	}
	public void fetchCar(int id) {
		Car_dto car=em.find(Car_dto.class, id);
		if(car!=null) {
			et.begin();
			System.out.println(car+""+car.getCust());
			et.commit();
		}
		else {
			System.out.println("PLEASE ENTER THE CORRECT ID");
		}
		
	}
	public void FetchAllCar() {
		et.begin();
		Query query=em.createQuery("select a from Car_dto a");
		
		List<Car_dto> car=(query.getResultList());
		for(Car_dto dto:car) {
			System.out.println(dto+""+dto.getCust());
		}
		et.commit();
			
		
		
	}
	public void Update(boolean value,int id) {
		Car_dto c=em.find(Car_dto.class,id);
		if(c!=null) {
			et.begin();
			c.setC_avail(value);
			em.merge(c);
			et.commit();
		}
		else {
			System.out.println("PLEASE ENTER THE CORRECT ID");
			
		
		
		
		
	}
	}
		public void display() {
			et.begin();
			Query q=em.createQuery("select a from Car-dto a");
			System.out.println(q.getResultList());
			et.commit();
		}
		public void pay(double amt,int id,int cust_id) {
			
			Car_dto car=em.find(Car_dto.class,id);
			
			if(car!=null && car.getC_rent()<=amt) {
				
				double bal=amt-car.getC_rent();
				System.out.println("AVAILABLE BALANCE IS:"+bal+"\nTHANK YOU FOR RENTING A CAR");
				
				
			}
			else {
				System.out.println("****INSUFFIECIENT BALANCE*******");
				c_dao.deleteId(cust_id);
				
			}
			
			
		}
		public void pay1(double amt,int id) {
Car_dto car=em.find(Car_dto.class,id);
			
			if(car!=null && car.getC_rent()<=amt) {
				
				double bal=amt-car.getC_rent();
				System.out.println("AVAILABLE BALANCE IS:"+bal+"\nTHANK YOU FOR RENTING A CAR");
				
				
			}
			else {
				System.out.println("****INSUFFIECIENT BALANCE*******");
			
		}
	}
}

