package com.ahsan.springboot.test.myTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ahsan.springboot.test.myTest.dao.PersonDAO;
import com.ahsan.springboot.test.myTest.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDAO personDAO;

	@Override
	@Transactional
	public List<Person> getAll() {
		return personDAO.getAll();
	}

	@Override
	public List<Person> findByFirstName(String firstName) {
		return personDAO.findByFirstName(firstName);
	}

	@Override
	public List<Person> findByLastName(String lastName) {
		return personDAO.findByLastName(lastName);
	}

}
