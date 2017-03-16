package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para acceso a personas
 * 
 * @author amaeztu
 *
 */
@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {
	
	Person findByDni(String dni);

}
