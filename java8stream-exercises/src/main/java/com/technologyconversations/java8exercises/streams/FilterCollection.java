package com.technologyconversations.java8exercises.streams;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FilterCollection {

	private FilterCollection() {
	}

	public static List<String> transform7(List<String> collection) {
		List<String> newCollection = new ArrayList<>();
		for (String element : collection) {
			if (element.length() < 4) {
				newCollection.add(element);
			}
		}
		return newCollection;
	}

	public static List<String> transform(List<String> collection) {
//		System.out.println(collection.stream().filter(value->value.length() < 4).collect(toList()) );
		return collection.stream().filter(value->value.length() < 4).collect(toList());
	}

}
