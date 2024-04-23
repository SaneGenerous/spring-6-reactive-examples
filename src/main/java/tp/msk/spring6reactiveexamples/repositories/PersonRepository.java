package tp.msk.spring6reactiveexamples.repositories;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tp.msk.spring6reactiveexamples.domain.Person;

public interface PersonRepository {
    Mono<Person> getById(Integer id);
    Flux<Person> findAll();
}
