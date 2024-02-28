package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
@Autowired
private ProductService cs;

@PostMapping("/add")
public void save(@RequestBody Product c) {
	cs.save(c);
}
@PutMapping("/add")
public void modify(@RequestBody Product c) {
	cs.modify(c);
}
@DeleteMapping("/add/{id}")
public void deleteById(@PathVariable int id) {
	cs.deleteById(id);
}
@GetMapping("/add/{id}")
public Product getById(@PathVariable int id) {
	return cs.getById(id);
}
@GetMapping("/add")
public List<Product> getAll() {
	return cs.getAll();
}
@GetMapping("/add/page")
public List<Product> getAllPageAndSort(@RequestParam int PageNo,@RequestParam int sizeSize,@RequestParam String field) {
	return cs.getAllPageAndSort(PageNo, sizeSize, field);
}


}
