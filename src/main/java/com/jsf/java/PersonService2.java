package com.jsf.java;

import java.util.ArrayList;
import java.util.List;

import anotations.PersonServiceAnotation;

@PersonServiceAnotation(value = 2)
public class PersonService2 implements PersonInterface {
	
	private List<Person> listPerson;
	
	public PersonService2() {
		listPerson = new ArrayList<Person>();
		listPerson.add(new Person(1, "C", 20));
		listPerson.add(new Person(2, "D", 20));
		listPerson.add(new Person(3, "E", 20));
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
