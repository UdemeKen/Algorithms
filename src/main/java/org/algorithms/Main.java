package org.algorithms;

import org.algorithms.assignValues.ValueAssignment;
import org.algorithms.findMinimum.FindMinimum;
import org.algorithms.findSum.FindSum_1;
import org.algorithms.findSum.FindSum_2;
import org.algorithms.moveZeros.MoveZeros;
import org.algorithms.removeEven.RemoveEven;
import org.algorithms.reverseArray.ReverseArray;
import org.algorithms.secondMax.SecondMax;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        For time complexity
        double now = System.currentTimeMillis();

//       Find Sum For method - 1
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

//        Find the minimum number of an array
        FindMinimum minimum = new FindMinimum();
        int[] minArr = {5, 7, 3, 1, 9, 4, 6};
        System.out.println("The element of the array is: " + Arrays.toString(minArr));
        int minResult = minimum.findMinimum(minArr);
        System.out.println("The minimum number of the array is: " + minResult);

//        Find the second maximum number of an array;
        SecondMax second = new SecondMax();
        int[] secMaxNumArr = {10, 55, 34, 75, 68, 33};
        System.out.println("The element of the array is: " + Arrays.toString(secMaxNumArr));
        int secMaxNum = second.secondMax(secMaxNumArr);
        System.out.println("The second maximum number is: " + secMaxNum);

//        Move the zeros to the end of the array
        MoveZeros move = new MoveZeros();
        int[] moveZeroArr = {0, 3, 0, 7, 4, 0, 5, 9, 6, 0, 2};
        System.out.println("The element of the array is: " + Arrays.toString(moveZeroArr));
        move.moveZeros(moveZeroArr, moveZeroArr.length);
        System.out.println("New array: " + Arrays.toString(moveZeroArr));

//        Value Assignment
        ValueAssignment valueAssignment = new ValueAssignment();
        valueAssignment.assignArray();
    }
}