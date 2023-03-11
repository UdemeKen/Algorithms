package org.algorithms.arrayAlgorithms.palindrome;

public class Palindrome {

    public boolean isPalindrome(String word){
        char[] wordArr = word.toCharArray();
        int start = 0;
        int end = wordArr.length - 1;
        while (start < end){
            if (wordArr[start] != wordArr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
