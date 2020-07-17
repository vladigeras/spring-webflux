package ru.vladigeras.springwebflux.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author vladi_geras on 17.07.2020
 */
@Setter
@Getter
@Entity
@Table(name = "person")
public class PersonEntity implements Serializable {
	private static final long serialVersionUID = 814303450530866990L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "fist_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "middle_name")
	private String middleName;

	@Column(name = "age")
	private Integer age;
}
