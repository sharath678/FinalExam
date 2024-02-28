package com.example.demo;

import java.util.List;

public interface ProductService {


	void save(Product c);
	void modify(Product c);
	void deleteById(int id);
	Product getById(int id);
	List<Product> getAll();
	List<Product> getAllPageAndSort(int PageNo,int sizeSize,String field);
}
