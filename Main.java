package com.metanit;
import java.util.Arrays;
import java.util.Collections;
public class Main {

    public static void main(String[] args) {
        int[] B;
        B = new int[6];

        B[0] = 10;
        B[1] = 14;
        B[2] = 36;
        B[3] = 27;
        B[4] = 43;
        B[5] = 18;

        Integer[] integerArray = new Integer[B.length];

        for (int i = 0; i < B.length; i++) {
            integerArray[i] = B[i];
        }

        Arrays.sort(integerArray, Collections.reverseOrder());

        for(int i = 0; i < integerArray.length; i++) System.out.println(integerArray[i]);
    }
}