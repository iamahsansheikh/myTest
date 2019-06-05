package com.ahsan.springboot.test.myTest.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahsan.springboot.test.myTest.entity.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {

	private EntityManager entityManager;

	@Autowired
	public PersonDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Person> getAll() {
		Session currentSession = entityManager.unwrap(Session.class);

		Query<Person> query = currentSession.createQuery("from Person", Person.class);

		List<Person> persons = query.getResultList();
		return persons;
	}

	@Override
	public List<Person> findByFirstName(String firstName) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Person> query = currentSession.createQuery("from Person where first_name=:firstName", Person.class)
				.setParameter("firstName", firstName);
		List<Person> persons = query.getResultList();
		return persons;
	}

	@Override
	public List<Person> findByLastName(String lastName) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Person> query = currentSession.createQuery("from Person where last_name=:lastName", Person.class)
				.setParameter("lastName", lastName);
		List<Person> persons = query.getResultList();
		return persons;
	}
	

}
