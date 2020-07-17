package ru.vladigeras.springwebflux.service;

import ru.vladigeras.springwebflux.model.dto.Person;

import java.util.List;

/**
 * @author vladi_geras on 17.07.2020
 */
public interface PersonService {
	List<Person> get();
}
