package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
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

       int n1 = Integer.parseInt(bufferedReader.readLine());
       int n2 = Integer.parseInt(bufferedReader.readLine());
       int n3 = Integer.parseInt(bufferedReader.readLine());

       int count_Positive = 0;
       if (n1 > 0) count_Positive++;
       if (n2 > 0) count_Positive++;
       if (n3 > 0) count_Positive++;
        System.out.println(count_Positive);
    }
}
