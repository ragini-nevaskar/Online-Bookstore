package com.rn.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rn.entities.Book;

@Repository
public class BookDAOImpl implements BookDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public Book save(Book book) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.saveOrUpdate(book);
		
		transaction.commit();
		session.close();
		
		return book;
	}

	public Book delete(String code) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		//get the book to be deleted
		Book book=session.get(Book.class, code);
		//pass book object in delete()
		session.delete(book);
		
		transaction.commit();
		session.close();
		
		return book;
	}

	public List<Book> getAllBooks() {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Book.class);
		List<Book> list=criteria.list();
		
		return list;
	}

	public Book getBookByCode(String code) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Book book=session.get(Book.class, code);
		
		transaction.commit();
		session.close();
		
		return book;
	}

	
	
}
