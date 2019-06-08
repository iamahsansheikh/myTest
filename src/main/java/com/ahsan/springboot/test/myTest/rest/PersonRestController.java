package com.ahsan.springboot.test.myTest.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahsan.springboot.test.myTest.entity.Person;
import com.ahsan.springboot.test.myTest.service.PersonService;


@RestController
@CrossOrigin
@RequestMapping("/api")
public class PersonRestController {

	@Autowired
	private PersonService personDAO;

	@GetMapping("/persons")
	public List<Person> getAll() {
		List<Person> persons = personDAO.getAll();
		if (persons.isEmpty() || persons == null) {
			throw new PersonNotFoundException("Person List is empty: ");

		}
		return persons;
	}

	@GetMapping("/persons/firstname/{firstname}")
	public List<Person> findByFirstName(@PathVariable String firstname) {

		List<Person> persons = personDAO.findByFirstName(firstname);
		if (persons.isEmpty() || persons == null) {
			throw new PersonNotFoundException("Person does not exist with this First Name: " + firstname);
		}
		return persons;
	}

	@GetMapping("/persons/lastname/{lastname}")
	public List<Person> findByLastName(@PathVariable String lastname) {

		List<Person> persons = personDAO.findByLastName(lastname);
		if (persons.isEmpty() || persons == null) {
			throw new PersonNotFoundException("Person does not exist with this Last Name: " + lastname);
		}
		return persons;
	}
}
