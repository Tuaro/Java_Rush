package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int amount_of_rows = 0;
        int num = 0;

        //напишите тут ваш код

        amount_of_rows = Integer.parseInt(reader.readLine());
        if (amount_of_rows > 0)
        {
            for (int i = 0; i < amount_of_rows; i++)
            {
                num = Integer.parseInt(reader.readLine());
                if (i == 0) maximum = num;
                if (num > maximum) maximum = num;
            }

            System.out.println(maximum);
        }
    }
}
