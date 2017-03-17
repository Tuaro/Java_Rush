package com.javarush.test.level07.lesson04.task01;

import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        //Инициализируйте (создайте и заполните) массив тут
        int [] arrayInit = new int[20];

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        for (int i = 0; i < 20; i++) {
             arrayInit[i] =  Integer.parseInt(bufferedReader.readLine());
        }
        return arrayInit;
    }

    public static int max(int[] array) {
        //Найдите максимальное значение в этом методе
        Arrays.sort(array);
        return array[array.length - 1];
    }
}
