package e_commerce.poc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class OrderEntity {
	
	@Id
	@Column(name="order_id")
	int order_id;
	
	@Column(name="cust_id")
	int cust_id;
	
	@Column(name="addr_id")
	int addr_id;
	
	@Column(name="order_amount")
	int order_amount;
	
	@Column(name="order_status")
	String order_status;
	
	@Column(name="order_date")
	String order_date;
	
	public OrderEntity() {
		
	}

	public OrderEntity(int order_id, int cust_id, int addr_id, int order_amount, String order_status,
			String order_date) {
		super();
		this.order_id = order_id;
		this.cust_id = cust_id;
		this.addr_id = addr_id;
		this.order_amount = order_amount;
		this.order_status = order_status;
		this.order_date = order_date;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public int getAddr_id() {
		return addr_id;
	}

	public void setAddr_id(int addr_id) {
		this.addr_id = addr_id;
	}

	public int getOrder_amount() {
		return order_amount;
	}

	public void setOrder_amount(int order_amount) {
		this.order_amount = order_amount;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	@Override
	public String toString() {
		return "OrderEntity [order_id=" + order_id + ", cust_id=" + cust_id + ", addr_id=" + addr_id + ", order_amount="
				+ order_amount + ", order_status=" + order_status + ", order_date=" + order_date + "]";
	}
	
	

}
