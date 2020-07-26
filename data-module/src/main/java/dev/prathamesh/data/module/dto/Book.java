package dev.prathamesh.data.module.dto;

import java.time.LocalDate;

public class Book extends BaseEntity {
	private static final long serialVersionUID = 3899705215394476701L;
	private String name;
	private String isbn10;
	private String isbn13;
	private LocalDate publicationDate;

	private Publisher publisher;

	public Book() {
		super();
	}

	public Book(String name, String isbn10, String isbn13, LocalDate publicationDate, Publisher publisher) {
		super();
		this.name = name;
		this.isbn10 = isbn10;
		this.isbn13 = isbn13;
		this.publicationDate = publicationDate;
		this.publisher = publisher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn10() {
		return isbn10;
	}

	public void setIsbn10(String isbn10) {
		this.isbn10 = isbn10;
	}

	public String getIsbn13() {
		return isbn13;
	}

	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}

	public LocalDate getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

}
