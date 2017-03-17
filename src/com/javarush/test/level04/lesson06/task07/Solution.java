package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
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
      num1 = bufferedReader.readLine();
      num2 = bufferedReader.readLine();
      num3 = bufferedReader.readLine();

      int n1, n2, n3;

      n1 = Integer.parseInt(num1);
      n2 = Integer.parseInt(num2);
      n3 = Integer.parseInt(num3);

      if (n1 == n2) System.out.println(3);
      if (n1 == n3) System.out.println(2);
      if (n2 == n3) System.out.println(1);

    }
}
