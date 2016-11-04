package com.brugnot.samples.spring.data.rest.core.repo;

import com.brugnot.samples.spring.data.rest.core.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Antonin on 04/11/2016.
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findByLastName(@Param("name") String name);
}
