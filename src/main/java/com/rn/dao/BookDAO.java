package com.rn.dao;

import java.util.List;

import com.rn.entities.Book;

public interface BookDAO {

	public Book save(Book book);
	public Book delete(String code);
	public List<Book> getAllBooks();
	public Book getBookByCode(String code);
}
