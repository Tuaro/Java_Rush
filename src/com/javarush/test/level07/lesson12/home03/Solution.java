package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum;
        int  minimum;

        //напишите тут ваш код
        ArrayList<Integer> listInteger = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            listInteger.add(Integer.parseInt(reader.readLine()));
        }

        maximum = listInteger.get(0);
        minimum = listInteger.get(0);

        for (int i = 0; i < listInteger.size(); i++) {
            if (listInteger.get(i) > maximum) {
                maximum = listInteger.get(i);
            }
        }

        for (int i = 0; i < listInteger.size(); i++) {
            if (listInteger.get(i) < minimum) {
                minimum = listInteger.get(i);
            }
        }

        System.out.println(maximum + " " + minimum);

    }
}
