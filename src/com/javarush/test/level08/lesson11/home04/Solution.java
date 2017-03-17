package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум
        int minimun = array.get(0);

        for (int i = 0; i < array.size(); i++){
           if (array.get(i) < minimun) {
             minimun = array.get(i);
           }
        }
        return minimun;
    }

    public static List<Integer> getIntegerList() throws IOException {
        //Тут создать и заполнить список
        List<Integer> integerList = new ArrayList<Integer>();

        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int num = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < num; i++) {
            integerList.add(Integer.parseInt(bufferedReader.readLine()));
        }
        return integerList;
    }
}
