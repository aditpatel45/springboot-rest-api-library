package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.books;

public interface bookRepo extends JpaRepository<books, Integer> {
	public books findByBarcode(int barcode);
	public void deleteByBarcode(int barcode);
}
