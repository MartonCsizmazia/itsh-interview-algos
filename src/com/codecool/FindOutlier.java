package com.codecool;

import java.util.Arrays;

public class FindOutlier{

    static boolean evenArray;
    static int evenNumbers = 0;

    static int find(int[] integers){
        for(int i= 0; i<3; i++){
            if(integers[i]%2 == 0){
                evenNumbers++;
            }
        }

        evenArray = evenNumbers >= 2;

        for (int integer : integers) {
            if (integer % 2 == 0 && !evenArray) {
                evenNumbers = 0;
                return integer;
            } else if (integer % 2 == 1 && evenArray) {
                evenNumbers = 0;
                return integer;
            } else if (integer % 2 == -1 && evenArray) {
                evenNumbers = 0;
                return integer;
            }
        }

        return 0;
    }}