package e_commerce.poc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class CategoryEntity {
	
	@Id
	@Column(name="catg_id")
	int catg_id;
	
	@Column(name="catg_namr")
	String catg_namr;
	
	@Column(name="catg_description")
	String catg_description;
	
	public CategoryEntity() {
		
	}

	public CategoryEntity(int catg_id, String catg_namr, String catg_description) {
		super();
		this.catg_id = catg_id;
		this.catg_namr = catg_namr;
		this.catg_description = catg_description;
	}

	public int getCatg_id() {
		return catg_id;
	}

	public void setCatg_id(int catg_id) {
		this.catg_id = catg_id;
	}

	public String getCatg_namr() {
		return catg_namr;
	}

	public void setCatg_namr(String catg_namr) {
		this.catg_namr = catg_namr;
	}

	public String getCatg_description() {
		return catg_description;
	}

	public void setCatg_description(String catg_description) {
		this.catg_description = catg_description;
	}

	@Override
	public String toString() {
		return "CategoryEntity [catg_id=" + catg_id + ", catg_namr=" + catg_namr + ", catg_description="
				+ catg_description + "]";
	}
	
	

}
