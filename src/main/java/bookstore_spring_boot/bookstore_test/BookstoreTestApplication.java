package bookstore_spring_boot.bookstore_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import bookstore_spring_boot.bookstore_test.domain.Book;
import bookstore_spring_boot.bookstore_test.domain.BookRepository;
import bookstore_spring_boot.bookstore_test.domain.Category;
import bookstore_spring_boot.bookstore_test.domain.CategoryRepository;
import bookstore_spring_boot.bookstore_test.domain.User;
import bookstore_spring_boot.bookstore_test.domain.UserRepository;

@SpringBootApplication
public class BookstoreTestApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BookstoreTestApplication.class);
	}
	
	private static final Logger log = LoggerFactory.getLogger(BookstoreTestApplication.class);
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(BookstoreTestApplication.class, args);
	}
	@Bean 
	public CommandLineRunner booklistTest(BookRepository repository, CategoryRepository crepository, UserRepository urepository) {
		return (args) -> {
			log.info("testing 1, 2, 3");
			crepository.save(new Category("Fantasy"));
			crepository.save(new Category("Sci-Fi"));
			crepository.save(new Category("Biography"));
			crepository.save(new Category("Thriller"));
			crepository.save(new Category("Fiction"));
			crepository.save(new Category("Young Adult"));
			crepository.save(new Category("Romance"));
			crepository.save(new Category("Adventure"));
			crepository.save(new Category("Action"));
			crepository.save(new Category("Classics"));
			crepository.save(new Category("Childrens"));

			repository.save(new Book("J.R.R. Tolkien", "The Lord of the Rings", 1955, 3340696-53, crepository.findByName("Fantasy").get(0)));
			repository.save(new Book("George Orwell", "Animal Farm", 1945, 7837833-51, crepository.findByName("Fiction").get(0)));
			repository.save(new Book("F. Scott Fitzgerald", "The Great Gatsby", 1925, 5009382-33, crepository.findByName("Classics").get(0)));
			repository.save(new Book("J.D. Salinger", "The Catcher in the Rye", 1951, 5110231-64, crepository.findByName("Classics").get(0)));
			repository.save(new Book("Jane Austen", "Pride and Prejudice", 1813, 6767676-74, crepository.findByName("Fantasy").get(0)));
			repository.save(new Book("Arthur Golden", "Memoirs of a Geisha", 1997, 6712312-74, crepository.findByName("Fiction").get(0)));
			repository.save(new Book("George R.R. Martin", "A Clash of Kings", 1998, 2212343-12, crepository.findByName("Fantasy").get(0)));
			repository.save(new Book("George R.R. Martin", "The Winds of Winter", 2023, 5656566-63, crepository.findByName("Fiction").get(0)));			
			repository.save(new Book("Suzanne Collins", "The Hunger Games", 2008, 2351236-74, crepository.findByName("Young Adult").get(0)));
			repository.save(new Book("Harper Lee", "To Kill a Mockingbird", 1960, 7319198-28, crepository.findByName("Classics").get(0)));
			repository.save(new Book("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", 1997, 6767676-74, crepository.findByName("Fantasy").get(0)));
			repository.save(new Book("Anne Frank", "The Diary of a Young Girl", 1947, 6876029-63, crepository.findByName("Classics").get(0)));
			repository.save(new Book("George Orwell", "1984", 1949, 7420192-28, crepository.findByName("Fiction").get(0)));
			repository.save(new Book("George R.R. Martin", "A Dance with Dragons", 2011, 4545455-52, crepository.findByName("Fantasy").get(0)));
			repository.save(new Book("Antoine de Saint-Exupéry", "The Little Prince", 1943, 6780819-65, crepository.findByName("Classics").get(0)));			
			repository.save(new Book("Markus Zusak", "The Book Thief", 2005, 1051167-76, crepository.findByName("Fiction").get(0)));
			repository.save(new Book("Charlotte Brontë", "Jane Eyre", 1847, 7332432-11, crepository.findByName("Classics").get(0)));
			repository.save(new Book("C.S. Lewis", "The Chronicles of Narnia", 1956, 7907960-58, crepository.findByName("Fantasy").get(0)));
			repository.save(new Book("George R.R. Martin", "A Storm of Swords", 2000, 2323232-33, crepository.findByName("Fantasy").get(0)));
			repository.save(new Book("William Golding", "Lord of the Flies", 1954, 2989055-37, crepository.findByName("Classics").get(0)));
			repository.save(new Book("William Shakespeare", "Romeo and Juliet", 1597, 2043056-73, crepository.findByName("Classics").get(0)));
			repository.save(new Book("J.K. Rowling", "Harry Potter and the Deathly Hallows", 2007, 386142-38, crepository.findByName("Fantasy").get(0)));
			repository.save(new Book("Khaled Hosseini", "The Kite Runner", 2003, 1241436-67, crepository.findByName("Fiction").get(0)));
			repository.save(new Book("J.R.R. Tolkien", "The Hobbit, or There and Back Again", 1937, 4759683-79, crepository.findByName("Fantasy").get(0)));
			repository.save(new Book("John Steinbeck", "Of Mice and Men", 1937, 4317676-72, crepository.findByName("Fiction").get(0)));
			repository.save(new Book("George R.R. Martin", "A Feast for Crows", 2005, 3434344-41, crepository.findByName("Fantasy").get(0)));
			repository.save(new Book("Dr. Seuss", "Green Eggs and Ham", 1960, 6767998-24, crepository.findByName("Childrens").get(0)));
			repository.save(new Book("Dr. Seuss", "The Cat in the Hat", 1957, 6765788-99, crepository.findByName("Childrens").get(0)));
			repository.save(new Book("Mark Twain", "The Adventures of Tom Sawyer", 1876, 6767676-74, crepository.findByName("Classics").get(0)));
			repository.save(new Book("Charles Dickens", "A Tale of Two Cities", 1859, 4322676-97, crepository.findByName("Classics").get(0)));
			repository.save(new Book("George R.R. Martin", "A Game of Thrones", 1996, 1232323-21, crepository.findByName("Fantasy").get(0)));
			repository.save(new Book("Ernest Hemingway", "The Old Man and the Sea", 1952, 6765455-63, crepository.findByName("Classics").get(0)));
			repository.save(new Book("Miguel de Cervantes Saavedra", "Don Quixote", 1605, 6767676-23, crepository.findByName("Classics").get(0)));
			repository.save(new Book("George R.R. Martin", "A Dream of Spring", 2026, 5656566-63, crepository.findByName("Fiction").get(0)));
			

			// Create users: admin/admin user/user
			// password encrypt
			// https://www.dailycred.com/article/bcrypt-calculator
			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "email1@jea.com", "USER");
			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "email2@jea.com", "ADMIN");
			urepository.save(user1);
			urepository.save(user2); 
			
			
			log.info("list all books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}
			};	
	}
}

