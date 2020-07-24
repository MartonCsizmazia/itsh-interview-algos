package com.codecool;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        // Your code here.
        int north=0, south=0, east=0, west=0;

        List<String> arra = Arrays.asList(arr);
        String[] arra2 = arra.toArray(new String[arra.size()]);
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == "NORTH"){
                north++;
            } else if(arr[i] == "SOUTH"){
                south++;
            } else if(arr[i] == "EAST"){
                east++;
            } else if(arr[i] == "WEST"){
                west++;
            }
        }
        int horizontal = north-south;
        int vertical = east-west;
        List<String> directions = new ArrayList<String>();

        if(horizontal>0){
            for(int i=0; i<horizontal;i++){
                directions.add("NORTH");
            }
        } else if(horizontal<0){
            for(int j=0; j<(horizontal*-1);j++){
                directions.add("SOUTH");
            }
        }


        if(vertical>0){
            for(int k=0; k<vertical;k++){
                directions.add("EAST");
            }
        } else if(vertical<0){
            for(int l=0; l<(vertical*-1);l++){
                directions.add("WEST");
            }
        }

        System.out.println(north);
        System.out.println(south);
        System.out.println(east);
        System.out.println(west);
        System.out.println(directions);
        return directions.toArray(new String[directions.size()]);
    }
}

