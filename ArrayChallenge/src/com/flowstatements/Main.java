package com.flowstatements;
// creating a program for writing all the elements in an array on descending order
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
	int[] myArray = getIntegers(5);
	int[] sorted = sortIntegers(myArray);
	printArray(sorted);

    }
    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter "+capacity+" , integer values.\r");

        for(int i=0;i<array.length;i++){
            array[i] =scan.nextInt();

        }
        return array;
    }
    public static void printArray(int[] array){
        for(int i = 0;i<array.length;i++){
            System.out.println("Element "+i+" contents"+array[i]);
        }

    }
   public static int[] sortIntegers(int[] array1){
       //making an array which is a copy of our original array to carry on with the sorting task.
       int[] sortedArray = new int[array1.length];
       for(int i=0;i<sortedArray.length;i++){
           sortedArray[i]=array1[i];
       }
       // alternative method of creating a sorted array instead of using the code mentioned above
       // using an inbuilt function
       //int[] sortedArray1 = Arrays.copyOf(array1,array1.length);


       // to sort the integers in descending order
       // very important code to sort integers in descending order
       boolean flag =true;
       int temporary;
       while(flag){
           flag=false;

           for(int i=0;i<sortedArray.length-1;i++){
               if(sortedArray[i]<sortedArray[i+1]){
                   temporary =sortedArray[i];
                   sortedArray[i]=sortedArray[i+1];
                   sortedArray[i+1]=temporary ;
               }
           }
       }
       return sortedArray;


   }


    }


