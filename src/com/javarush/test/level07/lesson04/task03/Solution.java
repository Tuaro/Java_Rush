package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
       String[] arrayString = new String[10];
       int[] arrayInt = new int[10];

        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        for (int i = 0; i < 10; i++) {
            arrayString[i] = bufferedReader.readLine();
            arrayInt[i] = arrayString[i].length();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arrayInt[i]);
        }
    }
}
