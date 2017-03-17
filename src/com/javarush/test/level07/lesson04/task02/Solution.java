package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
     String [] array = new String [10];
     int maxRows = array.length - 1;

        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        for (int i = 0; i < 8; i++) {
           array[i] = bufferedReader.readLine();
           }

        for (int i = 0; i < 10; i++) {
            System.out.println(array[maxRows - i]);
        }
    }
}