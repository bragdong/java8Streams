package com.technologyconversations.java8exercises.streams;

import java.util.List;

public class Sum {

    private Sum() {
    }

    public static int calculate7(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static int calculate(List<Integer> people) {
    	int total = people.stream().reduce(0, (x,y)->x+y);
//    	System.out.println("total="+total);
        return total;
    }

}
