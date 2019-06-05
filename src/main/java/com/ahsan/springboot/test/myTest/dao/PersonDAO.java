package com.ahsan.springboot.test.myTest.dao;

import java.util.List;

import com.ahsan.springboot.test.myTest.entity.Person;

public interface PersonDAO {

	public List<Person> getAll();

	public List<Person> findByFirstName(String firstName);

	public List<Person> findByLastName(String lastName);
}
