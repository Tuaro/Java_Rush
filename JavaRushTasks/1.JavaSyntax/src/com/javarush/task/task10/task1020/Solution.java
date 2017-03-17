package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);
        System.out.println(array[9]);
        System.out.println(array[10]);
/*        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }*/
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        Integer [] array2 = ;
        Arrays.sort(array, Collections.reverseOrder());
        Arrays.sort(array);


    }
}
