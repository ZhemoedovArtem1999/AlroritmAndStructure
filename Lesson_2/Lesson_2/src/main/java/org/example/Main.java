package org.example;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {5,4,9,1,5,2,5,3,0,1,7};


        System.out.println(Arrays.toString(array));

        HeapSort.sort(array);

        System.out.println("Отсортирован:\n" + Arrays.toString(array));
    }
}