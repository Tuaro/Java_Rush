package com.javarush.test.level04.lesson07.task02;

/* Строка - описание
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
«четное однозначное число» - если число четное и имеет одну цифру,
«нечетное однозначное число» - если число нечетное и имеет одну цифру,
«четное двузначное число» - если число четное и имеет две цифры,
«нечетное двузначное число» - если число нечетное и имеет две цифры,
«четное трехзначное число» - если число четное и имеет три цифры,
«нечетное трехзначное число» - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
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

      int n  = Integer.parseInt(bufferedReader.readLine());

      boolean isEven = n % 2 == 0;
      if (n > 0 && n < 1000)
      {
          if (n < 10 && isEven == true) System.out.println("четное однозначное число");
           else if (n < 10 && isEven == false) System.out.println("нечетное однозначное число");
           else if (n > 9 &&  n < 100 && isEven == true) System.out.println("четное двузначное число");
           else if (n > 9 &&  n < 100 && isEven == false) System.out.println("нечетное двузначное число");
           else if (n > 99 &&  n < 1000 && isEven == true) System.out.println("четное трехзначное число");
           else if (n > 99 &&  n < 1000 && isEven == false) System.out.println("нечетное трехзначное число");
      }
    }
}
