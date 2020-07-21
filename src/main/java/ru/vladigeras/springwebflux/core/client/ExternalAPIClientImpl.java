package ru.vladigeras.springwebflux.core.client;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import ru.vladigeras.springwebflux.model.dto.integration.Unicorn;

/**
 * @author vladi_geras on 21.07.2020
 */
@Service
public class ExternalAPIClientImpl implements ExternalAPIClient {
	private final WebClient client;

	public ExternalAPIClientImpl(WebClient.Builder clientBuilder) {
		client = clientBuilder
				.baseUrl("https://crudcrud.com/api/bf413cbb048648d9b16730537e8fb806")
				.build();
	}

	@Override
	public Flux<Unicorn> getUnicorns() {
		return client.get()
				.uri("/unicorns")
				.retrieve()
				.bodyToFlux(Unicorn.class);
	}
}
