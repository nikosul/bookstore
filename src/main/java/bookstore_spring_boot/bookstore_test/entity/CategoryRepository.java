package bookstore_spring_boot.bookstore_test.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long>{
	
	List<Category> findByName(String name);

}
