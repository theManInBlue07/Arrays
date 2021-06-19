package com.flowstatements;

public class Main {

    public static void main(String[] args) {
	int[] myINtArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(myINtArray[5]);
    //another method of initialising an array
    int[] myIntArray1 = new int[12];// this array will have 10 position starting from 0 to 9.
//    for(int i =0;i<10;i++){
//        myIntArray1[i] = i*10;
//    }
//    for(int i=0;i<10;i++){
//        System.out.println("Element "+i+" is, "+myIntArray1[i]);
//    }

        // second method
        for(int i =0;i<myIntArray1.length;i++){
            myIntArray1[i] = i*10;
        }
//        for(int i=0;i<myIntArray1.length;i++){
//            System.out.println("Element "+i+" is, "+myIntArray1[i]);
//        }

    printArray(myIntArray1);



    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Element "+i+" is, "+array[i]);

        }
    }
}
