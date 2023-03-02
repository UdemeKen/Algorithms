package org.algorithms;

import org.algorithms.assignValues.ValueAssignment;
import org.algorithms.findSum.FindSum_1;
import org.algorithms.findSum.FindSum_2;
import org.algorithms.removeEven.RemoveEven;
import org.algorithms.reverseArray.ReverseArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        For time complexity
        double now = System.currentTimeMillis();

//       Fin Sum For method - 1
        FindSum_1 findSum_1 = new FindSum_1();
        System.out.println(findSum_1.findSum(100));
        System.out.println("Time taken : " + (System.currentTimeMillis() - now) + " millisecond(s).");

//       Find Sum For method - 2
        FindSum_2 findSum_2 = new FindSum_2();
        System.out.println(findSum_2.findSum(100));
        System.out.println("Time taken : " + (System.currentTimeMillis() - now) + " millisecond(s).");

//        Remove Even Number
        RemoveEven odd = new RemoveEven();
        int[] arr = {3, 2, 4, 7, 10, 6, 5};
        System.out.println("The elements of the array are: " + Arrays.toString(arr));
        int[] finalResult = odd.removeEven(arr);
        System.out.println("The odd numbers are: " + Arrays.toString(finalResult));

//        Reverse Numbers of an Array
        ReverseArray reverse = new ReverseArray();
        int[] numbers = {2, 11, 5, 10, 7, 8};
        System.out.println("The elements of the array are: " + Arrays.toString(numbers));
        reverse.reverseArray(numbers, 0, numbers.length-1);
        System.out.println("This is the reverse version of the array" + Arrays.toString(numbers));

//        Value Assignment
        ValueAssignment valueAssignment = new ValueAssignment();
        valueAssignment.assignArray();

    }
}