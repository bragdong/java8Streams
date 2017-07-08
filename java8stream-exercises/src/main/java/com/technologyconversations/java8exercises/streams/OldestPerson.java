package com.technologyconversations.java8exercises.streams;

import java.util.Comparator;
import java.util.List;

public class OldestPerson {

    public static Person getOldestPerson7(List<Person> people) {
        Person oldestPerson = new Person("", 0);
        for (Person person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

    public static Person getOldestPerson(List<Person> people) {
    	Person p = people.stream().max(Comparator.comparing(Person::getAge)).get();
//    	System.out.println(p.getName()+" "+p.getAge());
        return people.stream().max(Comparator.comparing(Person::getAge)).get(); 
    }

}
