package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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

       int n1, n2, n3, max, avr, min;
       n1 = Integer.parseInt(num1);
       n2 = Integer.parseInt(num2);
       n3 = Integer.parseInt(num3);

       max = 0;
       avr = 0;
       min = 0;


       if (n1 > n2)
       {
           max = n1;
           min = n2;
       }
        else
       {
           max = n2;
           min = n1;
       }

       if (n3 > max) { avr = max;
                       max = n3;
                     }
       if (n3 < min) {avr = min;
                      min = n3;
                     }
       if (n3 < max && n3 > min) avr = n3;

        System.out.println(max);
        System.out.println(avr);
        System.out.println(min);



    }
}
