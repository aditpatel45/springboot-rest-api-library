package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.entity.books;
import com.example.repositories.bookRepo;

@Transactional
@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	bookRepo br;

	@Override
	public List<books> getAllBooks() {
		// TODO Auto-generated method stub
		return br.findAll();
	}

	@Override
	public boolean addBook(@RequestBody books b) {
		return br.save(b) != null;
	}

	@Override
	public books findByBarcode(int id) {
		books b = br.findByBarcode(id);
		return b;
	}

	@Override
	public void deleteByBarcode(int id) {
		// TODO Auto-generated method stub
		br.deleteByBarcode(id);
	}

	

}
