package com.codecool;

import java.util.Arrays;

public class PancakeSort {

    static int[] flip(int[] arr, int k){

        int arrLength = arr.length;

        int[] sortArr = new int[k];
        int[] nonSortArr = new int[arrLength-k];

        int j = k;
        for (int i = 0; i < arrLength; i++){
            if(i<k){
                sortArr[j-1] = arr[i];
                j--;
            } else {
                nonSortArr[i-k] = arr[i];
            }
        }

        int[] joinedArray = new int[arrLength];

        for (int i = 0; i < arrLength; i++){
            if(i<k){
                joinedArray[i] = sortArr[i];
            } else{
                joinedArray[i] = nonSortArr[i-k];
            }
        }

        return joinedArray ;
    }

    static int getMax(int arr[], int k){
        int max = 0;
        int maxIndex = 0;

        for(int i = 0; i < k; i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static int[] pancakeSort(int[] arr){
        int j=arr.length;
        for(int i=0; i < arr.length; i++){

            int max = getMax(arr, j);

            arr = flip(arr,max+1);
            arr = flip(arr,j);
            j--;

            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }
}
