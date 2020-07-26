package dev.prathamesh.data.module.dto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Auther extends BaseEntity {
	private static final long serialVersionUID = -7856661132754177045L;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;

	private Set<Book> books = new HashSet<>();

	public Auther() {
		super();
	}
	
	public Auther(String firstName, String lastName, LocalDate dateOfBirth, Set<Book> books) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.books = books;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
}
