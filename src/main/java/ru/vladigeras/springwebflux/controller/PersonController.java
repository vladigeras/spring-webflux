package ru.vladigeras.springwebflux.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vladigeras.springwebflux.model.dto.Person;
import ru.vladigeras.springwebflux.service.PersonService;

import java.util.List;

/**
 * @author vladi_geras on 17.07.2020
 */
@RequiredArgsConstructor
@RequestMapping("/v1/persons")
@RestController
public class PersonController {
	private final PersonService personService;

	@GetMapping
	public List<Person> get() {
		return personService.get();
	}
}
