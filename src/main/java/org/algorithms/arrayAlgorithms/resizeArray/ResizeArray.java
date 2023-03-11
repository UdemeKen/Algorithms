package org.algorithms.arrayAlgorithms.resizeArray;

public class ResizeArray {

    public int[] resizeArray(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }
}
