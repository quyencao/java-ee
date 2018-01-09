package com.jsf.java;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import anotations.PersonServiceAnotation;

@PersonServiceAnotation(value = 1)
public class PersonService implements PersonInterface {
	
	private List<Person> listPerson;

	
	public PersonService() {
		listPerson = new ArrayList<Person>();
		listPerson.add(new Person(1, "A", 20));
		listPerson.add(new Person(2, "B", 20));
		listPerson.add(new Person(3, "C", 20));
	}

	public Person getPerson(int id) {
		for(Person p: listPerson) {
			if(p.getId() == id) {
				return p;
			}
		}
		
		return null;
	}

	public List<Person> getListPerson() {
		return listPerson;
	}


}
