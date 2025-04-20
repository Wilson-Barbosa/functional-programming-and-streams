package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercise 2: Uppercase and Filter
 * 
 * Given a list of strings, return a list of names longer than 5 characters, all
 * in uppercase.
 */
public class UppercaseAndFilter {

    public static void main(String[] args) {

        List<String> list = List.of(
                "Paul of Tarsus",
                "James",
                "hello",
                "Bonjour",
                "Hey",
                "Hi",
                "Hurrayye");

        List<String> streamedList = declarativeSolution(list);
        System.out.println("Streammed list result:");
        for (String string : streamedList) {
            System.out.println(string);
        }

        List<String> loopedList = imperativeSolution(list);
        System.out.println("\nLooped list result:");
        for (String string : loopedList) {
            System.out.println(string);
        }

    }

    private static List<String> declarativeSolution(List<String> list) {

        // return list.stream()
        //         .filter(s -> s.length() > 5)
        //         .map(s -> s.toUpperCase())
        //         .collect(Collectors.toList());

        return list.stream()
                .filter(s -> s.length() > 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

    }

    private static List<String> imperativeSolution(List<String> list) {
        List<String> newList = new ArrayList<>();

        for(String string : list) {
            if(string.length() > 5) {
                newList.add(string.toUpperCase());
            }
        }

        return newList;
    }
}
