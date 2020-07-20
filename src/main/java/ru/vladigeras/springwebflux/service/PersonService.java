package ru.vladigeras.springwebflux.service;

import reactor.core.publisher.Flux;
import ru.vladigeras.springwebflux.model.dto.Person;

/**
 * @author vladi_geras on 17.07.2020
 */
public interface PersonService {
	Flux<Person> get();
}
