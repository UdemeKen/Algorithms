package org.algorithms.findMinimum;

public class FindMinimum {

    public int findMinimum(int[] arr){
        if (arr == null || arr.length == 0){
            throw  new IllegalArgumentException("Invalid input");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
