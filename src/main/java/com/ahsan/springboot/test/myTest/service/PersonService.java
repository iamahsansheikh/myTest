package com.ahsan.springboot.test.myTest.service;

import java.util.List;

import com.ahsan.springboot.test.myTest.entity.Person;

public interface PersonService {

	public List<Person> getAll();

	public List<Person> findByFirstName(String firstName);

	public List<Person> findByLastName(String lastName);
}
