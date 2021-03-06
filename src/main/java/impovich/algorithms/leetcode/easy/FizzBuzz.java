package impovich.algorithms.leetcode.easy;


/*
https://leetcode.com/problems/fizz-buzz/#/description
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
For numbers which are multiples of both three and five output “FizzBuzz”.

Example:

n = 15,

Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]
* */

import java.util.LinkedList;
import java.util.List;

/**
 * @author Alexander Hamza
 *         created 04/05/2017.
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> result = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
                continue;
            }

            if (i % 3 == 0) {
                result.add("Fizz");
                continue;
            }

            if (i % 5 == 0) {
                result.add("Buzz");
                continue;
            }

            result.add(String.valueOf(i));
        }

        return result;
    }
}
