package controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Persistence;

import dao.Car_dao;
import dao.Customer_dao;
import dto.Car_dto;
import dto.Customer_dto;

public class Car_User {

	public static void main(String[] args) {
//		Car_dto c=new Car_dto();
		Car_dao dao=new Car_dao();
//		Customer_dao dao1=new Customer_dao();
//		SAVING CAR OBJECTS WITHOUT CUSTOMERS//
//		c.setC_id(1);
//		c.setC_model("SUZUKI");
//		c.setC_type("SUZUKI-ALTO");
//		c.setC_rent(1500);
//		c.setC_avail(true);
//		dao.saveCar(c);
//		Car_dto c1=new Car_dto();
//		c1.setC_id(2);
//		c1.setC_model("VOLVO");
//		c1.setC_type("VOLVO");
//		c1.setC_rent(2000);
//		c1.setC_avail(true);
//		dao.saveCar(c1);
		
//		Car_dto c2=new Car_dto();
//		c2.setC_id(3);
//		c2.setC_model("MAHINDRA");
//		c2.setC_type("MAHINDRA");
//		c2.setC_rent(2500);
//		c2.setC_avail(true);
//		dao.saveCar(c2);
//		Car_dto c3=new Car_dto();
//		c3.setC_id(4);
//		c3.setC_model("SUZUKI");
//		c3.setC_type("SUZUKI-ALTO");
//		c3.setC_rent(1500);
//		c3.setC_avail(true);
//		dao.saveCar(c3);
//		ENDED SAVING******************************
//		SAVING CUSTOMER DETAILS******************
//		Customer_dto c1=new Customer_dto();
//		c1.setId(001);
//		c1.setName("Krishna");
//		c1.setPhone(9876543210l);
//		dao1.save(c1);
//		Customer_dto c2=new Customer_dto();
//		c2.setId(002);
//		c2.setName("CHARAN");
//		c2.setPhone(9182838383l);
//		dao1.save(c2);

//		Customer_dto c3=new Customer_dto();
//		c3.setId(003);
//		c3.setName("NANDAN");
//		c3.setPhone(965432626l);
//		dao1.save(c3);
//		Customer_dto c4=new Customer_dto();
//		c4.setId(003);
//		c4.setName("NANDAN");
//		c4.setPhone(965432626l);
//		dao1.save(c3);
		
//		saved customers also
//		List<Customer_dto> list1=new ArrayList();
//		list1.add(c3);
//		c1.setCust(list1);
//		c3.setCar(c1);
//		dao.saveCar(c1);
		
		Car_dto car=new Car_dto();
		car.setC_id(6);
		car.setC_model("TOYOTA");
		car.setC_type("TOYOX");
		car.setC_avail(true);
		car.setC_rent(2500);
		dao.saveCar(car);
		
		
		
		
		

	}

}
