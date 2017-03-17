package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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

        String num1, num2, num3;
        int n1, n2, n3, plus = 0, minus = 0;

        num1 = bufferedReader.readLine();
        num2 = bufferedReader.readLine();
        num3 = bufferedReader.readLine();

        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);
        n3 = Integer.parseInt(num3);

        if (n1 >= 0) plus++;
         else minus++;

        if (n2 >= 0) plus++;
        else minus++;

        if (n3 >= 0) plus++;
        else minus++;

        System.out.println("количество отрицательных чисел: " + minus);
        System.out.println("количество положительных чисел: " + plus);
    }
}
