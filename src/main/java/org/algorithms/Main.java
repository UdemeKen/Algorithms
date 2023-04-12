package org.algorithms;

import org.algorithms.arrayAlgorithms.assignValues.ValueAssignment;
import org.algorithms.arrayAlgorithms.findMinimum.FindMinimum;
import org.algorithms.arrayAlgorithms.findSum.FindSum_1;
import org.algorithms.arrayAlgorithms.findSum.FindSum_2;
import org.algorithms.arrayAlgorithms.missingNum.MissingNum;
import org.algorithms.arrayAlgorithms.moveZeros.MoveZeros;
import org.algorithms.arrayAlgorithms.palindrome.Palindrome;
import org.algorithms.arrayAlgorithms.removeEven.RemoveEven;
import org.algorithms.arrayAlgorithms.resizeArray.ResizeArray;
import org.algorithms.arrayAlgorithms.reverseArray.ReverseArray;
import org.algorithms.arrayAlgorithms.secondMax.SecondMax;

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

//        Resize an array
        ResizeArray resize = new ResizeArray();
        int[] originalArr = {2, 5, 6, 1};
        System.out.println("The size of  originalArray is: " + originalArr.length);
        originalArr = resize.resizeArray(originalArr, originalArr.length * 2);
        System.out.println("The size of originalArray after resizing is: " + originalArr.length);

//        Find the Missing Number in an array
        MissingNum missing = new MissingNum();
        int[] missArrNum = {1, 4, 7, 3, 5, 2, 9, 8};
        System.out.println("The element of the array is: " + Arrays.toString(missArrNum));
        int missingNum = missing.missingNum(missArrNum);
        System.out.println("The missing number in the array is: " + missingNum);

//        Check if a word is palindrome
        Palindrome palindrome = new Palindrome();
        String word = "that";
        if (palindrome.isPalindrome(word)){
            System.out.println("The word *" +word.toUpperCase()+ "* is a palindrome");
        }else {
            System.out.println("The word *" +word.toUpperCase()+ "* is not a palindrome");
        }

//        Value Assignment
        ValueAssignment valueAssignment = new ValueAssignment();
        valueAssignment.assignArray();
    }
}