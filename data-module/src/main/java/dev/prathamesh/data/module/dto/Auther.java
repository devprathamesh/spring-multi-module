package dev.prathamesh.data.module.dto;

import java.time.LocalDate;

public class Auther {

	private String name;
	private LocalDate dob;

	public Auther(String name, LocalDate dob) {
		super();
		this.name = name;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
}
