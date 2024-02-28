package com.example.demo;

import java.util.List;

public interface CategoryService {

	void save(Category c);
	void modify(Category c);
	void deleteById(int id);
	Category getById(int id);
	List<Category> getAll();
	List<Category> getAllPageAndSort(int PageNo,int sizeSize,String field);
}
