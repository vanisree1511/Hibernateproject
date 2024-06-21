package dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Car_dto {
	@Id
	private int c_id;
	private String c_model;
	private String c_type;
	private double c_rent;
	private boolean c_avail;
	@OneToMany(mappedBy="car",cascade=CascadeType.ALL)
	private List<Customer_dto> cust;
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_model() {
		return c_model;
	}
	public void setC_model(String c_model) {
		this.c_model = c_model;
	}
	public String getC_type() {
		return c_type;
	}
	public void setC_type(String c_type) {
		this.c_type = c_type;
	}
	public double getC_rent() {
		return c_rent;
	}
	public void setC_rent(double c_rent) {
		this.c_rent = c_rent;
	}
	public boolean isC_avail() {
		return c_avail;
	}
	public void setC_avail(boolean c_avail) {
		this.c_avail = c_avail;
	}
	public List<Customer_dto> getCust() {
		return cust;
	}
	public void setCust(List<Customer_dto> cust) {
		this.cust = cust;
	}
	@Override
	public String toString() {
		return "\nc_id=" + c_id + "\n c_model=" + c_model + "\n c_type=" + c_type + "\n c_rent=" + c_rent
				+ "\n c_avail=" + c_avail ;
	}
	public Car_dto() {
		super();
	}
	
}
