package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import utils.Creators;

/**
 * Exercise 1: Filter Even Numbers
 * 
 * Given a list of integers, return a new list containing only the even numbers.
 */

public class FilterEvenNumbers {

    private static List<Integer> originalList = Creators.generateRandomList(20, 100);

    public static void main(String args[]) {

        List<Integer> streamed = declarativeSolution();
        List<Integer> looped = imperativeSolution();

        System.out.println("Stream strategy:");
        for (Integer integer : streamed) {
            System.out.println(integer);
        }

        System.out.println("\nLoop strategy:");
        for (Integer integer : looped) {
            System.out.println(integer);
        }

    }

    private static List<Integer> declarativeSolution() {
        Stream<Integer> stream = originalList.stream();
        return stream.filter(n -> n.intValue() % 2 == 0).collect(Collectors.toList());
    }

    private static List<Integer> imperativeSolution() {
        List<Integer> newList = new ArrayList<>();

        for (Integer n : originalList) {
            if (n.intValue() % 2 == 0) {
                newList.add(n);
            }
        }

        return newList;
    }
}
