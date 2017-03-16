package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "tperson")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	@Size
	private String personName;

	@NotNull
	@Size
	private String personSurname1;

	@NotNull
	@Size
	private String dni;

	@NotNull
	@Email
	private String emailAddress;

	public String getDni() {
		return dni;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public Long getId() {
		return id;
	}

	public String getPersonName() {
		return personName;
	}

	public String getPersonSurname1() {
		return personSurname1;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void setPersonSurname1(String personSurname1) {
		this.personSurname1 = personSurname1;
	}

}
