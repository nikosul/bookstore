package bookstore_spring_boot.bookstore_test.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import bookstore_spring_boot.bookstore_test.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	
	Optional<Book> findById(int i);
	
	List<Book> findByTitle(String Title);
	
}
