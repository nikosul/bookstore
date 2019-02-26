package bookstore_spring_boot.bookstore_test.entity;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import bookstore_spring_boot.bookstore_test.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	
	Optional<Book> findById(Long bookId);

}
