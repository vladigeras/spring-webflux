package ru.vladigeras.springwebflux.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import ru.vladigeras.springwebflux.model.entity.PersonEntity;

/**
 * @author vladi_geras on 17.07.2020
 */
@Repository
public interface PersonRepository extends ReactiveCrudRepository<PersonEntity, Long> {
}
