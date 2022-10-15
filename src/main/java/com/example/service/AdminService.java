package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.books;

public interface AdminService {
	
	public List<books> getAllBooks();
	public boolean addBook(books b);
	public books findByBarcode(int barcode);
	public void deleteByBarcode(int id);

}
