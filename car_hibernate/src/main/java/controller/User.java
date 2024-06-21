package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dao.Car_dao;
import dao.Customer_dao;
import dto.Car_dto;
import dto.Customer_dto;

public class User {

	public static void main(String[] args) throws Throwable {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Car_dto dto1=new Car_dto();
		Customer_dto dto=new Customer_dto();
		Scanner scan=new Scanner(System.in);
		Car_dao dao=new Car_dao();
		Customer_dao c_dao=new Customer_dao();
		System.out.println("***********WELCOME TO DRIVESTAR*************");
		boolean set=true;
		boolean set1=true;
		boolean set2=true;
		do {
			System.out.println("ENTER THE OPTION\n 1.ADMIN 2.CUSTOMER 3.EXIT");
			int choice=scan.nextInt();

		if(choice==1) {
			do {
			System.out.println("ENTER THE OPTIONS YOU WANT\n 1.VIEW CARS 2.UPDATE 3.EXIT");
			int i=scan.nextInt();
			if(i==1) {
			
				dao.FetchAllCar();
			}
			else if(i==2) {
				System.out.println("SET THE AVAILABILITY FOR THE CAR(TRUE/FALSE,ID)");
				boolean value=scan.nextBoolean();
				int id=scan.nextInt();
				dao.Update(value, id);
			}
			else if(i==3) {
				set1=false;
				System.out.println("*********THANK YOU**********");
				
			}
		}while(set1);
			
			
		}
		else if(choice==2) 
		{
			do {
				System.out.println("AVAILABE OPTIONS FOR YOU");
			System.out.println("1.DISPLAY THE CARS YOU RENTED(OLD CUSTOMER)\n 2.NEW CUSTOMER(ENTRY AND RENT)\n 3.EXIT");
			int i=scan.nextInt();
			if(i==1) {
				System.out.println("ENTER YOUR CUSTOMER ID");
				int id=scan.nextInt();
				c_dao.getCustomerCar(id);
				
			}
			else if(i==2) {
				System.out.println("ENTER THE CUSTOMER ID");
				int id=scan.nextInt();
				System.out.println("ENTER YOUR NAME");
				String name=scan.next();
				System.out.println("ENTER YOUR PHONENUMBER");
				Long ph=scan.nextLong();
				System.out.println("ENTER WHICH CAR YOU WANT TO RENT");
				int car_id=scan.nextInt();
				Query q=em.createQuery("select a from Car_dto a");
				List<Car_dto> list=q.getResultList();
				
				for(Car_dto list1:list) {
					
					if(list1.getC_id()==car_id) {
						if(list1.isC_avail()==true) {
						Customer_dto c_dto=new Customer_dto();
						c_dto.setId(id);
						c_dto.setName(name);
						c_dto.setPhone(ph);
						c_dto.setCar(list1);
						c_dao.save(c_dto);
						System.out.println("ENTER THE AMOUNT TO RENT THE CAR");
						double amt=scan.nextDouble();
						dao.pay(amt,car_id,c_dto.getId());
					}
					else{
						System.out.println("SORRY CAR IS NOT AVAILABALE CHOOSE OTHER CAR");
					}
					
				}
					
						
				}
				
				
				
				
				
				
			}
			else if(i==3) {
				
				set2=false;
				System.out.println("THANK YOU");
			
				      
				}		
		
					
			
			
		}while(set2);
		 
		}
		else {
			set=false;
			System.out.println("****THANK YOU****");
		}
	
	
		}while(set);	

	


		
	}
}
