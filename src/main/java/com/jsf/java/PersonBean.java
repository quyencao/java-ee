package com.jsf.java;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import anotations.PersonServiceAnotation;

@Named
@RequestScoped
public class PersonBean {
	
	@Inject @PersonServiceAnotation(value=1)
	private PersonInterface personService;
	
	private List<Person> people;
	
	@PostConstruct
	public void init() {
		people = personService.getListPerson();
	}

	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		this.people = people;
	}
}
