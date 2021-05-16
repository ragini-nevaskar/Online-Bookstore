package com.rn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rn.dao.BookDAO;
import com.rn.entities.Book;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDAO bookdao;
	
	public Book addBook(Book book) {
		
		book=bookdao.save(book);
		return book;
	}

	public Book deleteBook(String code) {
		
		Book book=bookdao.delete(code);
		return book;
	}

	public Book getBookByCode(String code) {
		
		return bookdao.getBookByCode(code);
	}

	public List<Book> getAllBooks() {
		
		List<Book> books=bookdao.getAllBooks();
		return books;
	}

}
