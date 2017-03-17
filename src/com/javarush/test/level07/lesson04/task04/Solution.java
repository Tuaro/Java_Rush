package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
      int [] arrayInt = new int [10];
      InputStream inputStream = System.in;
      InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
      BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

      for (int i = 0; i < 10; i++) {
          arrayInt[i] = Integer.parseInt(bufferedReader.readLine());
      }

      for (int i = arrayInt.length - 1; i >= 0; i--) {
          System.out.println(arrayInt[i]);
      }

    }
}
