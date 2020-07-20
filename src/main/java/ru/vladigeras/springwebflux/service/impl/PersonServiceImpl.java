package ru.vladigeras.springwebflux.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import ru.vladigeras.springwebflux.core.PersonMapper;
import ru.vladigeras.springwebflux.model.dto.Person;
import ru.vladigeras.springwebflux.repository.PersonRepository;
import ru.vladigeras.springwebflux.service.PersonService;

/**
 * @author vladi_geras on 17.07.2020
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class PersonServiceImpl implements PersonService {
	private final PersonRepository personRepository;

	@Transactional(readOnly = true)
	@Override
	public Flux<Person> get() {
		PersonMapper mapper = new PersonMapper();
		return personRepository
				.findAll()
				.log()
				.map(mapper::map);
	}
}
