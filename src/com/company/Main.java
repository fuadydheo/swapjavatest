package com.company;

public class Main {

    public static void main(String[] args) {
        int[] oldArray = {5, 3, 7, 9};
        int[] newArray = shiftMultiple(oldArray, -2);
        printArray(newArray);
    }

    public static int[] shiftMultiple(int[] arr, int count) {
        for (int i = 0; i < count; i++)
            shiftArrayRight(arr);
        return arr;
    }

    public static int[] shiftArrayRight(int[] array1) {
        int tempVariable = array1[array1.length - 1];
        for (int i = array1.length - 2; i > -1; i--) {
            array1[i + 1] = array1[i];
        }
        array1[0] = tempVariable;
        return array1;
    }

    public static void printArray(int[] arr) {
        for (int x : arr)
            System.out.println(x + ",");
    }
}
