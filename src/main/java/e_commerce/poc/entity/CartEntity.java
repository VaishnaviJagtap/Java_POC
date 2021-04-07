package e_commerce.poc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class CartEntity {

	@Id
	@Column(name="cart_id")
	int cart_id;
	
	@Column(name="cust_id")
	int cust_id;
	
	@Column(name="prod_detail_id")
	int prod_detail_id;
	
	@Column(name="cart_quantity")
	int cart_quantity;
	
	public CartEntity() {
		
	}

	public CartEntity(int cart_id, int cust_id, int prod_detail_id, int cart_quantity) {
		super();
		this.cart_id = cart_id;
		this.cust_id = cust_id;
		this.prod_detail_id = prod_detail_id;
		this.cart_quantity = cart_quantity;
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public int getProd_detail_id() {
		return prod_detail_id;
	}

	public void setProd_detail_id(int prod_detail_id) {
		this.prod_detail_id = prod_detail_id;
	}

	public int getCart_quantity() {
		return cart_quantity;
	}

	public void setCart_quantity(int cart_quantity) {
		this.cart_quantity = cart_quantity;
	}

	@Override
	public String toString() {
		return "CartEntity [cart_id=" + cart_id + ", cust_id=" + cust_id + ", prod_detail_id=" + prod_detail_id
				+ ", cart_quantity=" + cart_quantity + "]";
	}
	
	
}
