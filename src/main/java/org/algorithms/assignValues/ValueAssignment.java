package org.algorithms.assignValues;

public class ValueAssignment {

    public void printArray(int[] arr){
        int[] n = arr;
        System.out.print("The array elements are: ");
        for (int i = 0; i < n.length; i++){
            System.out.print(n[i] + ", ");
        }
    }

    public void assignArray(){
        int[] arrayList = new int[5];
        arrayList[0] = 2;
        arrayList[1] = 4;
        arrayList[2] = 6;
        arrayList[3] = 8;
        arrayList[4] = 10;
        System.out.println("The array size: " + arrayList.length);
        System.out.println("The last element of the area is: " + arrayList[arrayList.length - 1]);
        printArray(arrayList);
    }
}
