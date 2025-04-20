package exercise;

import java.util.List;

import utils.Creators;

/**
 * Exercise 3: Sum of Squares
 * 
 * Given a list of integers, return the sum of their squares.
 * (e.g. [1, 2, 3] → 1² + 2² + 3² = 14)
 */
public class SumOfSquares {

    public static void main(String[] args) {

        List<Integer> list = Creators.generateRandomList(10, 20);

        System.out.println("Streammed sum: " + declarativeSolution(list));
        System.out.println("Looped sum: " + imperativeSolution(list));

    }

    private static long declarativeSolution(List<Integer> list) {
        // return list.stream()
        //         .map(n -> Math.pow(n, 2l))
        //         .sum
    }

    private static long imperativeSolution(List<Integer> list) {
        long sum = 0;

        for (Integer num : list) {
            sum += num * num;
        }

        return sum;
    }

}
