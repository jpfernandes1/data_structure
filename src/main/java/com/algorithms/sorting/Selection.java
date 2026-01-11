package com.algorithms.sorting;

import java.util.Arrays;

/*
    This type of sorting starts from the principle that we should take the smallest element and place it in the first position (index 0).
    Once we already placed the smallest, we can ignore it and start the next iteration at the index 1.. and so it goes
 */
public class Selection {

    public static void SelectionSort(int[] array){
        int posSmallestInitial;
        int iteration, temp;
        int posSmallest = 0;
        int i;

        for (iteration = 0; iteration < array.length - 1; iteration++) {
            posSmallestInitial = iteration; // At beginning, the first element is considered to be the smallest;
            posSmallest= iteration + 1;
            for (i = posSmallestInitial + 1; i < array.length; i++) {
                if (array[i] < array[posSmallest]) {
                    posSmallest = i;
                }
            }
            System.out.println("Smaller element found at position: " + posSmallest);
            if(array[posSmallest] < array[posSmallestInitial]){
                // change
                temp = array[posSmallestInitial];
                array[posSmallestInitial] = array[posSmallest];
                array[posSmallest] = temp;
            }
            System.out.println("Iteration " + iteration);
            System.out.println(Arrays.toString(array));
        }
    }
}

