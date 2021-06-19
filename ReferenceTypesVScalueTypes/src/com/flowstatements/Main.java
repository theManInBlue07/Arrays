package com.flowstatements;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int myvalue1 = 10;
	int anothervalue=myvalue1;
        //System.out.println("anotherValue=="+anothervalue);
       // System.out.println("myValue1== " +myvalue1);
        //both the variables have the same value.
        anothervalue++;
        System.out.println("anotherValue=="+anothervalue);// 10 is incremented to 11 .
        System.out.println("myValue1== " +myvalue1);// value remains the same ==10.


    // Reference types--> like STrings ; Arrays.
    int[] myIntArray = new int[5];
    for(int i = 0;i<myIntArray.length;i++){
        myIntArray[i] = i*5;
    }

    int[] anotherIntArray = myIntArray;
    //adding another reference to the same array in the memory.
        System.out.println("anotherINtArray== "+ Arrays.toString(anotherIntArray));
        System.out.println("myINtArrays=="+Arrays.toString(myIntArray));

    // implementing a change to one of the Arrays
    anotherIntArray[0]=100; // changing the zeroeth index value to 100.

    System.out.println("anotherINtArray after the change in value == "+ Arrays.toString(anotherIntArray));
    System.out.println("myINtArrays after the change in value=="+Arrays.toString(myIntArray));
    // there a change in both the arrays at zeroeth position ==100 instead of 0.
    // it's because the reference types represent the address of the variable rather than the data itself.
        anotherIntArray = new int[]{1,2,3,4,5};
        modifyArray(anotherIntArray);
    //anotherIntArray = new int[]{1,2,3,4,5};
        System.out.println("anotherINtArray after applying the method == "+ Arrays.toString(anotherIntArray));
        System.out.println("myINtArrays after applying the method=="+Arrays.toString(myIntArray));
    }
    public static void modifyArray(int[] array){
        array[2]=5;
        array[1]=7;
        array = new int[]{1,2,3,4,5};
    }
}
