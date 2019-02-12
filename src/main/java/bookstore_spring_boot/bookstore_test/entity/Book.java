package bookstore_spring_boot.bookstore_test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	
	private String author;
	private String title;
	private int year;
	private int isbn;

	public Book() {
		super();
		this.id = null;
		this.author = null;
		this.title = null;
		this.year = 0;
		this.isbn = 0;
	}
	public Book(String author, String title, int year, int isbn) {
		super();
		this.author = author;
		this.title = title;
		this.year = year;
		this.isbn = isbn;
	}
	public Book(Long id, String author, String title, int year, int isbn) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.year = year;
		this.isbn = isbn;
	}
	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", title=" + title + ", year=" + year + ", isbn=" + isbn + "]";
	}
}
