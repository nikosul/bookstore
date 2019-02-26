package bookstore_spring_boot.bookstore_test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bookstore_spring_boot.bookstore_test.entity.BookRepository;
import bookstore_spring_boot.bookstore_test.entity.CategoryRepository;
import bookstore_spring_boot.bookstore_test.entity.Book;


@Controller

public class BookController {
	@Autowired
	private BookRepository repository;
	
	@Autowired
	private CategoryRepository crepository;

	@RequestMapping(value="/listofbooks")
	public String bookList(Model model) {
		model.addAttribute("books", repository.findAll());
		return "listofbooks";
	}
	@RequestMapping(value ="/add")
	public String addBook(Model model) {
		model.addAttribute("book", new Book());
		model.addAttribute("categories", crepository.findAll());
		return "addbook";
	}
	@RequestMapping(value ="/add", method = RequestMethod.POST)
	public String save(Book book) {
		repository.save(book);
		return "redirect:listofbooks";
	}
	@RequestMapping(value ="/edit/{id}")
	public String addBook(@PathVariable("id") Long bookId, Model model) {
		model.addAttribute("book", repository.findById(bookId));
		return "editbook";
	}
	@RequestMapping(value="/deletebook/{id}", method = RequestMethod.GET)
	public String deleteBook(@PathVariable("id") Long bookId) {
		repository.deleteById(bookId);
		return "redirect:../listofbooks";
	}
}