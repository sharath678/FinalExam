package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CategoryController {

	@Autowired
	private CategoryService cs;

	@PostMapping("/add")
	public void save( @RequestBody Category c) {
		cs.save(c);
	}

	@PutMapping("/add")
	public void modify(@RequestBody Category c) {
		cs.modify(c);
	}

	@DeleteMapping("/add/{id}")
	public void deleteById(@PathVariable int id) {
		cs.deleteById(id);
	}

	@GetMapping("/add/{id}")
	public Category getById(@PathVariable int id) {
		return cs.getById(id);
	}

	@GetMapping("/add")
	public List<Category> getAll() {
		return cs.getAll();
	}

	@GetMapping("/add/page")
	public List<Category> getAllPageAndSort(@RequestParam int PageNo,@RequestParam int sizeSize,@RequestParam String field) {
		return cs.getAllPageAndSort(PageNo, sizeSize, field);
	}
	
	
}
