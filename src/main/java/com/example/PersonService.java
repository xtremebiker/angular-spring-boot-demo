package com.example;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

	private PersonRepo repo;

	public PersonService(PersonRepo repo) {
		super();
		this.repo = repo;
	}

	public List<Person> listPeople() {
		return repo.findAll();
	}

	public Person findByDni(String dni) {
		return repo.findByDni(dni);
	}

}
