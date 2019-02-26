package bookstore_spring_boot.bookstore_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import bookstore_spring_boot.bookstore_test.entity.Book;
import bookstore_spring_boot.bookstore_test.entity.BookRepository;
import bookstore_spring_boot.bookstore_test.entity.Category;
import bookstore_spring_boot.bookstore_test.entity.CategoryRepository;

@SpringBootApplication
public class BookstoreTestApplication {
	
	private static final Logger log = LoggerFactory.getLogger(BookstoreTestApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreTestApplication.class, args);
	}
	@Bean 
	public CommandLineRunner booklistTest(BookRepository repository, CategoryRepository crepository) {
		return (args) -> {
			log.info("testing 1, 2, 3");
			crepository.save(new Category("Fantasy"));
			crepository.save(new Category("Sci-Fi"));
			crepository.save(new Category("Biography"));
			crepository.save(new Category("Thriller"));

			
			repository.save(new Book("George R.R. Martin", "A Game of Thrones", 1996, 1232323-21, crepository.findByName("Fantasy").get(0)));
			repository.save(new Book("George R.R. Martin", "A Clash of Kings", 1998, 2212343-12, crepository.findByName("Fantasy").get(0)));
			repository.save(new Book("George R.R. Martin", "A Storm of Swords", 2000, 2323232-33, crepository.findByName("Fantasy").get(0)));
			repository.save(new Book("George R.R. Martin", "A Feast for Crows", 2005, 3434344-41, crepository.findByName("Fantasy").get(0)));
			repository.save(new Book("George R.R. Martin", "A Dance with Dragons", 2011, 4545455-52, crepository.findByName("Fantasy").get(0)));
			repository.save(new Book("George R.R. Martin", "The Winds of Winter", 2020, 5656566-63, crepository.findByName("Fantasy").get(0)));
			repository.save(new Book("George R.R. Martin", "A Dream of Spring", 2025, 6767676-74, crepository.findByName("Fantasy").get(0)));
			
			log.info("list all books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}
			};	
	}
}

