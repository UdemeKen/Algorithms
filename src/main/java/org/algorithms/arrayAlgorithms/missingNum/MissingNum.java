package org.algorithms.arrayAlgorithms.missingNum;

public class MissingNum {

    public int missingNum(int[] arr){
        int n = arr.length +1;
        int sum = n * (n + 1) / 2;
        for (int num : arr){
            sum = sum - num;
        }
        return sum;
    }
}
