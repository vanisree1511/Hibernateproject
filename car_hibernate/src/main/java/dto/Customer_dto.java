package dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Customer_dto {
	@Id
 private int id;
 private String name;
 private long phone;
 @ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn
 private Car_dto car;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public Car_dto getCar() {
	return car;
}
public void setCar(Car_dto car) {
	this.car = car;
}
@Override
public String toString() {
	return "Customer_dto [id=" + id + ", name=" + name + ", phone=" + phone + "]";
}
public Customer_dto() {
	super();
}
 
 
}
