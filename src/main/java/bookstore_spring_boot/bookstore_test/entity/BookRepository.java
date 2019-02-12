package bookstore_spring_boot.bookstore_test.entity;

import org.springframework.data.repository.CrudRepository;
import bookstore_spring_boot.bookstore_test.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
