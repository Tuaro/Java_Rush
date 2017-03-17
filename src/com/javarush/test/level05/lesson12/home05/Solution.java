package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        //напишите тут ваш код
        int num = 0, summa = 0;
        String numS;


        while (1 == 1) {
            numS = bufferedReader.readLine();
            if (numS.equals("сумма")) break;
            num = Integer.parseInt(numS);
            summa = summa + num;
        }
        System.out.println(summa);
    }
}
