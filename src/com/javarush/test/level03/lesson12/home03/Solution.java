package com.javarush.test.level03.lesson12.home03;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
1
1 + 1 = 2
1 + 2 = 3
2 + 3 = 5
3 + 5 = 8
*/
import java.io.*;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        int a = 1, b = 1, n, fib;
        n = 10;
        for (int i = 0; i < n; i++ ) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(fib + " ");

        }
    }
}