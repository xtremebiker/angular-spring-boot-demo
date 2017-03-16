package com.example;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;

/**
 * Controlador REST para gestión de personas. Utiliza la clase Entity de Person,
 * en un proyecto real, utilizar una clase intermedia y no la entity
 * directamente
 * 
 * @author amaeztu
 *
 */
@RestController
public class PersonController {

	private PersonService personService;

	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}

	@RequestMapping(path = "/people")
	public List<Person> listPeople(@RequestParam(required = false) String dni) {
		if (dni != null) {
			return Lists.newArrayList(personService.findByDni(dni));
		}
		return personService.listPeople();
	}

}
