package com.algorithms.search;

public class Binary {

    public static int binarySearch(int[] vector, int valueToSearch){
        int mid, start, end;
        start = 0;
        end = vector.length - 1;

        while (start <= end){
            mid = (start + end) / 2;
            if (vector[mid] == valueToSearch){
                return mid;
            }
            else{
                if(valueToSearch > vector[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
           }
       }
            return -1;
    }
}

