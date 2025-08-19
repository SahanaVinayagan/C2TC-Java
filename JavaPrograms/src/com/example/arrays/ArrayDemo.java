package com.example.arrays;

import java.util.Arrays;

public class ArrayDemo {

        public static void main(String[] args) {

                int intArr[] = {10,20,30,40,50};

                System.out.println("Array elements are "+Arrays.toString(intArr));
                Arrays.sort(intArr);
                System.out.println("Array elements are "+Arrays.toString(intArr));

                int keyValue = 50;
                System.out.println(keyValue+" "+"found at "+Arrays.binarySearch(intArr, keyValue));
        }

}