package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
       InputStream inputStream = System.in;
       Reader inputStreamReader = new InputStreamReader(inputStream);
       BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

       String num1, num2;

        num1 = bufferedReader.readLine();
        num2 = bufferedReader.readLine();

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int result = n1;

        if (n1 > n2) result = n2;
        System.out.println(result);
    }
}