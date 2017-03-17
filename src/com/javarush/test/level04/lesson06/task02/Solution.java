package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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

      String num1, num2, num3, num4;
      num1 = bufferedReader.readLine();
      num2 = bufferedReader.readLine();
      num3 = bufferedReader.readLine();
      num4 = bufferedReader.readLine();

      int n1, n2, n3, n4;

      n1 = Integer.parseInt(num1);
      n2 = Integer.parseInt(num2);
      n3 = Integer.parseInt(num3);
      n4 = Integer.parseInt(num4);

      int compare1 = n1;
      int compare2 = n3;

      if (n1 < n2) compare1 = n2;
      if (n3 < n4) compare2 = n4;

      if (compare1 > compare2) System.out.println(compare1);
       else System.out.println(compare2);
    }
}
