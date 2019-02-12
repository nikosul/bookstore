package bookstore_spring_boot.bookstore_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import bookstore_spring_boot.bookstore_test.entity.Book;
import bookstore_spring_boot.bookstore_test.entity.BookRepository;

@SpringBootApplication
public class BookstoreTestApplication {
	
	private static final Logger log = LoggerFactory.getLogger(BookstoreTestApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreTestApplication.class, args);
	}
	@Bean 
	public CommandLineRunner booklistTest(BookRepository repository) {
		return (args) -> {
			log.info("testing 1, 2, 3");
			repository.save(new Book("Ernest Hemingway", "A Farewell to Arms", 1929, 1232323-21));
			repository.save(new Book("George Orwell", "Animal Farm", 1945, 2212343-5));
			
			log.info("list all books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}
			};	
	}
}

