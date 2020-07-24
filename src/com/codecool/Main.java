package com.codecool;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

import static com.codecool.PancakeSort.getMax;
import static com.codecool.PancakeSort.pancakeSort;

public class Main {
    public static void main(String[] args) {


        int[] array2 = PancakeSort.flip(new int[]{6, 5, 42, 18, 7, 15, 3}, 3);

        //flip(array2, 7);
        pancakeSort(new int[]{6, 5, 42, 18, 7, 15, 3, 58});
        System.out.println(getMax(new int[]{6, 5, 42, 18, 7, 15, 3}, 4));

        //System.out.println(FindOutlier.find(new int[]{206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}));

        System.out.println(FindOutlier.find(new int[]{1, 1, 1, 1, 1, 44, 7, 7, 7, 7, 7, 7, 7, 7}));



    }
}
