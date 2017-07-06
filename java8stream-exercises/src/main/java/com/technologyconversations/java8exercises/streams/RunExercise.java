package com.technologyconversations.java8exercises.streams;

import static java.util.Arrays.asList;

import java.util.List;

public class RunExercise {

    private RunExercise() {
    }

    List<Integer> numbers = asList(1, 2, 3, 4, 5);
    		
    public static int calculate7(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("total = "+total);
        return total;
    }

    public static int calculate(List<Integer> people) {
    	int sum = people.stream().reduce(0, (a,b) -> a+b);
        return sum;
    }

}
