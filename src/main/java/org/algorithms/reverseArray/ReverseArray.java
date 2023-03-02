package org.algorithms.reverseArray;

public class ReverseArray {

    public void reverseArray(int[] numbers, int start, int end){
        while (start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }
}
