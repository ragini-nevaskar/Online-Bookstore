package com.rn.service;

import java.util.List;

import com.rn.entities.Book;

public interface BookService {

	public Book addBook(Book book);
	public Book deleteBook(String code);
	public Book getBookByCode(String code);
	public List<Book> getAllBooks();
}
