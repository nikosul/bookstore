package bookstore_spring_boot.bookstore_test.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import bookstore_spring_boot.bookstore_test.model.Book;

@Controller

public class BookController {
	
	private List<Book> Books; 
	
	@PostConstruct
	private void luoKirja() {
	
		Book book1 = new Book("book", "book r.r", 2019, 12345, 12);
		Book book2 = new Book("book 2", "qwerty", 1999, 12345, 5);
		Book book3 = new Book("book x", "l.t", 1995, 12345, 2);
		
		Books = new ArrayList<>();
		
		Books.add(book1);
		Books.add(book2);
		Books.add(book3);
		
	}
	@RequestMapping("/index")
	public String bookList(Model model) {
		model.addAttribute("Books", Books);
		return "listofbooks";
	}
}


