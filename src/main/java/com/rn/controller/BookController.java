package com.rn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rn.entities.Book;
import com.rn.entities.User;
import com.rn.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	
	/* ADDITION MODULE */
	
	@RequestMapping("add")
	public String addBookFormHandler() {
		// TODO Auto-generated method stub
		return "addBookForm";
	}

	@RequestMapping("addBook")
	public ModelAndView addBookHandler(@ModelAttribute("details") Book book) {
		
		book=bookService.addBook(book);
		
		ModelAndView mv=new ModelAndView("addBookFeedback");
		
		return mv;
	}

	
	/* DELETION MODULE */
	
	@RequestMapping("delete")
	public String deleteBookFormHandler() {
		return "deleteBookForm";
	}

	@RequestMapping("deleteBook")
	public ModelAndView deleteBookHandler(@RequestParam("isbn") String code) {
		
		Book book=bookService.deleteBook(code);
		ModelAndView mv=new ModelAndView("deleteBookFeedback");
		mv.addObject(book);
		return mv;
	}
	
	@RequestMapping("deleteBookThroughForm")
	public ModelAndView deleteBookThroughFormHandler(@RequestParam("code") String code) {
		
		Book book=bookService.deleteBook(code);
		ModelAndView mv=new ModelAndView("redirect:selectall");
		return mv;
	}

	
	/* UPDATE MODULE */
	
	@RequestMapping("savechanges")
	public ModelAndView updateBookHandler(@ModelAttribute("book") Book book) {
		
		bookService.addBook(book);
		ModelAndView mv=new ModelAndView("redirect:selectall");
		return mv;
	}
	
	@RequestMapping("updateBook")
	public ModelAndView updateBookFormHandler(@RequestParam("code") String code) {
		
		Book book=bookService.getBookByCode(code);
		ModelAndView mv=new ModelAndView("updateBookForm");
		mv.addObject("book", book);
		return mv;
	}
	
	/* SELECTION MODULE */
	
	//select all
	@RequestMapping("selectall")
	public ModelAndView selectAllBooksHandler() {
		
		List<Book> books=bookService.getAllBooks();
		
		ModelAndView mv=new ModelAndView("allBooks");
		mv.addObject("books", books);
		return mv;
	}
	
	//select by code
	@RequestMapping("getBookByCode")
	public ModelAndView getBookByCodeHandler(@RequestParam("isbn") String code) {
		
		Book book=bookService.getBookByCode(code);
		ModelAndView mv=new ModelAndView("displayBookByCode");
		mv.addObject("book", book);
		return mv;
	}
	
	@RequestMapping("selectbycode")
	public String selectBookByCodeFormHandler() {
		return "selectBookByCodeForm";
	}
	
	
	/* BACK TO HOMEPAGE */
	
	@RequestMapping("exit")
	public String handlerThree() {
		// TODO Auto-generated method stub
		return "/../../index";
	}
	

}
