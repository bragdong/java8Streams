package com.technologyconversations.java8exercises.streams;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class PeopleStats {

    private PeopleStats() {
    }

    public static Stats getStats7(List<Person> people) {
        long sum = 0;
        int min = people.get(0).getAge();
        int max = 0;
        for (Person person : people) {
            int age = person.getAge();
            sum += age;
            min = Math.min(min, age);
            max = Math.max(max, age);
        }
        return new Stats(people.size(), sum, min, max);
    }

    public static IntSummaryStatistics getStats(List<Person> people) {
    	
    	double avg = people.stream().mapToDouble( p -> p.getAge()).average().getAsDouble();
 	   	
    	int max = people.stream().max(Comparator.comparing(Person::getAge)).get().getAge();

    	int min = people.stream().min(Comparator.comparing(Person::getAge)).get().getAge();

    	int sum = people.stream().mapToInt(i -> i.getAge()).sum();
    	
//		return new IntSummaryStatistics(avg,people.size(),max,min,sum);
		return null;

    }

}
