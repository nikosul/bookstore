package bookstore_spring_boot.bookstore_test;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import bookstore_spring_boot.bookstore_test.web.BookController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookControllerTest {
	
	@Autowired
	private BookController controller;

	@Test
	public void contextLoads() throws Exception {
	assertThat(controller).isNotNull();
	}
}
