package bookstore_spring_boot.bookstore_test.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import bookstore_spring_boot.bookstore_test.domain.Book;
import bookstore_spring_boot.bookstore_test.domain.BookRepository;
import bookstore_spring_boot.bookstore_test.domain.CategoryRepository;


@Controller
public class BookController {
	@Autowired
	private BookRepository repository;
	
	@Autowired
	private CategoryRepository crepository;

	@RequestMapping(value="/")
    public String login() {	
        return "login";
    }	
	
	@RequestMapping(value="/listofbooks")
	public String bookList(Model model) {
		model.addAttribute("books", repository.findAll());
		return "listofbooks";
	}
	// REST
	@RequestMapping(value ="/books", method = RequestMethod.GET)
	public @ResponseBody List<Book> booklistRest() {
		return (List<Book>) repository.findAll();
	}
	//REST
	@RequestMapping(value ="/book/{id}", method = RequestMethod.GET)
	public @ResponseBody Optional<Book> findbookRest(@PathVariable("id") Long bookId) {
		return repository.findById(bookId);	
	}
	@RequestMapping(value ="/add")
	public String addBook(Model model) {
		model.addAttribute("book", new Book());
		model.addAttribute("categories", crepository.findAll());
		return "addbook";
	}
	@RequestMapping(value ="/save", method = RequestMethod.POST)
	public String save(@ModelAttribute Book book) {
		repository.save(book);
		return "redirect:listofbooks";
	}
	@PreAuthorize("hasAuthority('ADMIN')")
	@RequestMapping(value ="/edit/{id}")
	public String addBook(@PathVariable("id") Long bookId, Model model) {
		model.addAttribute("book", repository.findById(bookId));
		model.addAttribute("categories", crepository.findAll());
		return "editbook";
	}
	@PreAuthorize("hasAuthority('ADMIN')")
	@RequestMapping(value="/deletebook/{id}", method = RequestMethod.GET)
	public String deleteBook(@PathVariable("id") Long bookId) {
		repository.deleteById(bookId);
		return "redirect:../listofbooks";
	}
}