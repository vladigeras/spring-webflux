package ru.vladigeras.springwebflux.core;

import ru.vladigeras.springwebflux.model.dto.Person;
import ru.vladigeras.springwebflux.model.entity.PersonEntity;

/**
 * @author vladi_geras on 17.07.2020
 */
public class PersonMapper {
	public Person map(PersonEntity personEntity) {
		Person person = new Person();
		person.setId(personEntity.getId());
		person.setFirstName(personEntity.getFirstName());
		person.setLastName(personEntity.getLastName());
		person.setMiddleName(personEntity.getMiddleName());
		person.setAge(personEntity.getAge());
		return person;
	}
}
