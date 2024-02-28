package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Category_tb")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int category_id;
	private String category_name;
	private String category_stocks;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Product> product=new ArrayList<>();

	public Category(int category_id, String category_name, String category_stocks, List<Product> product) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		this.category_stocks = category_stocks;
		this.product = product;
	}

	public Category() {
		super();
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getCategory_stocks() {
		return category_stocks;
	}

	public void setCategory_stocks(String category_stocks) {
		this.category_stocks = category_stocks;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", category_name=" + category_name + ", category_stocks="
				+ category_stocks + ", product=" + product + "]";
	}
	
	
}
