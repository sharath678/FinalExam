package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Product_tb")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int product_id;
	private String product_name;
	public Product(int product_id, String product_name) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
	}
	public Product() {
		super();
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + "]";
	}
	
	
}
