package ru.vladigeras.springwebflux.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;

/**
 * @author vladi_geras on 17.07.2020
 */
@Setter
@Getter
@Table("person")
public class PersonEntity implements Serializable {
	private static final long serialVersionUID = 814303450530866990L;

	@Id
	private Long id;

	@Column("fist_name")
	private String firstName;

	@Column("last_name")
	private String lastName;

	@Column("middle_name")
	private String middleName;

	@Column("age")
	private Integer age;
}
