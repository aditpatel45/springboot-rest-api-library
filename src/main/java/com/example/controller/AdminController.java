package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.books;
import com.example.service.AdminServiceImpl;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class AdminController {
	
	@Autowired
	private AdminServiceImpl asl;
	
	@GetMapping("/books")
	public List<books> getAllBooks(){
		List<books> bi = asl.getAllBooks();
		if(bi.size()==0) System.out.println("no books");
		return bi;
	}
	
	@PostMapping("/add")
	public String addBooks(@RequestBody books b) {
		boolean val = asl.addBook(b);
		if(val==true)
			return "book-added";
		else
			return "book not added";
	}
	
	@GetMapping(value = "/books/{id}")
	public books findByBarcode(@PathVariable int id) {
		return asl.findByBarcode(id); 
	}
	
	@DeleteMapping("/delete/{barcode}")
    public void deleteBook(@PathVariable int barcode) {
		asl.deleteByBarcode(barcode);
    }
	

}
