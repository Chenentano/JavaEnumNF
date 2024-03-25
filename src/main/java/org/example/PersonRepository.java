package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class PersonRepository {

    Map<Integer, Person> personMap = new HashMap<>();

    public Optional<Person> findPersonByID(int id) {
        return Optional.ofNullable(personMap.get(id));
    }

}
