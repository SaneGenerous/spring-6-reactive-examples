package tp.msk.spring6reactiveexamples.repositories;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tp.msk.spring6reactiveexamples.domain.Person;

public class PersonRepositoryImpl implements PersonRepository {

    Person michael = Person.builder().id(1).firstName("Michael").firstName("Weston").build();
    Person fiona = Person.builder().id(2).firstName("Fiona").firstName("Glenanne").build();
    Person sam = Person.builder().id(3).firstName("Sam").firstName("Axe").build();
    Person jesse = Person.builder().id(4).firstName("Jesse").firstName("Porter").build();
    @Override
    public Mono<Person> getById(Integer id) {
        return Mono.just(michael);
    }

    @Override
    public Flux<Person> findAll() {
        return Flux.just(michael, fiona, sam, jesse);
    }
}
