package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        char [] list = s.toCharArray();

        if (list[0] != ' ' ) {
            list[0] = Character.toUpperCase(list[0]);
        }


        for (int i = 1; i < list.length; i++) {
            if (list[i] != ' ' && list[i - 1] == ' ')
            {
             list[i] = Character.toUpperCase(list[i]);
            }

        }

        for (int i = 0; i < list.length; i++) {
                 System.out.print(list[i]);
        }
    }


}
