package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        PersonRepository repository = new PersonRepository();

        repository.personMap.put(1, new Person(1, "Basti", DaysOfWeek.Monday));
        repository.personMap.put(2, new Person(2, "Quynh", DaysOfWeek.Wednesday));

        int idToSearch = 3;
        Optional<Person> personOptional = repository.findPersonByID(idToSearch);

        personOptional.ifPresent(person -> {
            System.out.println("Name: " + person.name());
            System.out.println("Favorite Day: " + person.favoriteDay());
        });
    }


    public static String weekdayOrWeekend(DaysOfWeek daysOfWeek){
        if(daysOfWeek == DaysOfWeek.Saturday ||daysOfWeek == DaysOfWeek.Sunday){
            return "Weekend!";
        }
            return "Weekday!";
    }


}