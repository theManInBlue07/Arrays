package com.flowstatements;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	int[] myArray = getIntegers(5);
        for(int i = 0;i < myArray.length;i++){
            System.out.println("Element "+i+ " ,Value typed was "+ myArray[i]);
        }
        System.out.println("The average is "+getAverage(myArray));

    }


    // creating a method for getting typed elements stored in an array.
    public static int[] getIntegers(int number){
        System.out.println("Enter "+number+" , integer values.\r");
        int[] values = new int[number];
        for(int i = 0;i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        return  values;
    }
// a method for calculating average for all the elements ina n array.
    public static double getAverage(int[] integers ){
        int sum = 0;
        for(int i =0;i<integers.length;i++){
            sum += integers[i];
        }
        return (double)sum/(double) integers.length;
    }




}
