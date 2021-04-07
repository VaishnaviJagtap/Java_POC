package e_commerce.poc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_details")
public class CustomerEntity {

	@Id
	@Column(name="cust_id")
	int cust_id;
	
	@Column(name="cust_name")
	String custname;
	
	@Column(name="date_of_birth")
	String date_of_birth;
	
	@Column(name="cust_email")
	String cust_email;
	
	@Column(name="phone_number")
	int phone_number;
	
	@Column(name="cust_password")
	String cust_password;
	
	@Column(name="cust_date_joined")
	String cust_date_joined;
	
	public CustomerEntity() {
		
	}
	
	/*public CustomerEntity(int cust_id, String cust_name, String date_of_birth, String cust_email, int phone_number,
			String cust_password, String cust_date_joined) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.date_of_birth = date_of_birth;
		this.cust_email = cust_email;
		this.phone_number = phone_number;
		this.cust_password = cust_password;
		this.cust_date_joined = cust_date_joined;
	}*/

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return custname;
	}

	public void setCust_name(String cust_name) {
		this.custname = cust_name;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getCust_email() {
		return cust_email;
	}

	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public String getCust_password() {
		return cust_password;
	}

	public void setCust_password(String cust_password) {
		this.cust_password = cust_password;
	}

	public String getCust_date_joined() {
		return cust_date_joined;
	}

	public void setCust_date_joined(String cust_date_joined) {
		this.cust_date_joined = cust_date_joined;
	}

	@Override
	public String toString() {
		return "CustomerEntity [cust_id=" + cust_id + ", cust_name=" + custname + ", date_of_birth=" + date_of_birth
				+ ", cust_email=" + cust_email + ", phone_number=" + phone_number + ", cust_password=" + cust_password
				+ ", cust_date_joined=" + cust_date_joined + "]";
	}
	
	
}
