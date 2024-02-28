package com.example.demo;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepo cr;

	@Override
	public void save(Category c) {
		// TODO Auto-generated method stub
		cr.save(c);
	}

	@Override
	public void modify(Category c) {
		// TODO Auto-generated method stub
		cr.save(c);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
	}

	@Override
	public Category getById(int id) {
		// TODO Auto-generated method stub
		Optional<Category> opt=cr.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		Iterable<Category> itr=cr.findAll();
		List<Category> lst=new ArrayList<Category>();
		itr.forEach(e->lst.add(e));
		return lst;
	}

	@Override
	public List<Category> getAllPageAndSort(int PageNo, int sizeSize, String field) {
		// TODO Auto-generated method stub
		Pageable p=PageRequest.of(PageNo,sizeSize,Direction.ASC,field);
		return cr.findAll(p).toList();
	}
	
	
	
}
