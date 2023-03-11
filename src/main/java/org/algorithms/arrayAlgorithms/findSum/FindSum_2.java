package org.algorithms.arrayAlgorithms.findSum;

public class FindSum_2 {

    public int findSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }
}
