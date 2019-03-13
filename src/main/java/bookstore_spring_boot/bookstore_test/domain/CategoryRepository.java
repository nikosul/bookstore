package bookstore_spring_boot.bookstore_test.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long>{
	
	List<Category> findByName(String name);

}
