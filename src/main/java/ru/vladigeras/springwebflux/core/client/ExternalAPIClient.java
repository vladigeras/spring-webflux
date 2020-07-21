package ru.vladigeras.springwebflux.core.client;

import reactor.core.publisher.Flux;
import ru.vladigeras.springwebflux.model.dto.integration.Unicorn;

/**
 * @author vladi_geras on 21.07.2020
 */
public interface ExternalAPIClient {
	Flux<Unicorn> getUnicorns();
}
