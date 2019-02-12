package bookstore_spring_boot.bookstore_test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bookstore_spring_boot.bookstore_test.entity.BookRepository;
import bookstore_spring_boot.bookstore_test.entity.Book;


@Controller

public class BookController {
	@Autowired
	private BookRepository repository;

	@RequestMapping(value="/listofbooks")
	public String bookList(Model model) {
		List<Book> books = (List<Book>) repository.findAll();
		model.addAttribute("books", books);
		return "listofbooks";
	}
	@RequestMapping(value ="/add", method = RequestMethod.GET)
	public String addBook(Model model) {
		model.addAttribute("book", new Book());
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