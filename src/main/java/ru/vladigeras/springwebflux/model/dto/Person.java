package ru.vladigeras.springwebflux.model.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author vladi_geras on 17.07.2020
 */
@Setter
@Getter
public class Person {
	private Long id;
	private String firstName;
	private String lastName;
	private String middleName;
	private Integer age;
}
