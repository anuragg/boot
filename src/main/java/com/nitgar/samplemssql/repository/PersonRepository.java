package com.nitgar.samplemssql.repository;

import com.nitgar.samplemssql.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by avnitagupta on 13/05/17.
 */
public interface PersonRepository extends MongoRepository<Person, String> {
    List<Person> findByLastName(String lastName);
}
