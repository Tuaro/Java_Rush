package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //напишите тут ваш код
       for (int j = 0; j < array.length; j++){
        for (int i = array.length - 1; i > 0; i--)
        {
            String a = array[i];
            String b = array[i - 1];

            if (isGreaterThan(a, b) == false)
            {
                array[i] = b;
                array[i - 1] = a;
            }
        }
    }

    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
/*        System.out.println( a + " > " + b);
        System.out.println(a.compareTo(b) > 0);
*/
        return a.compareTo(b) > 0;
    }
}
