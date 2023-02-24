package org.example;

import org.example.assignValues.ValueAssignment;
import org.example.findSum.FindSum_1;
import org.example.findSum.FindSum_2;

public class Main {
    public static void main(String[] args) {
//        For time complexity
        double now = System.currentTimeMillis();

//        For method - 1
        FindSum_1 findSum_1 = new FindSum_1();
        System.out.println(findSum_1.findSum(100));
        System.out.println("Time taken : " + (System.currentTimeMillis() - now) + " millisecond(s).");

//        For method - 2
        FindSum_2 findSum_2 = new FindSum_2();
        System.out.println(findSum_2.findSum(100));
        System.out.println("Time taken : " + (System.currentTimeMillis() - now) + " millisecond(s).");

        ValueAssignment valueAssignment = new ValueAssignment();
        valueAssignment.assignArray();
    }
}