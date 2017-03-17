package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name_month = bufferedReader.readLine();

        Map<String, Integer> map_month = new HashMap<String, Integer>();

        map_month.put("January", 1);
        map_month.put("February", 2);
        map_month.put("March", 3);
        map_month.put("April", 4);
        map_month.put("May", 5);
        map_month.put("June", 6);
        map_month.put("July", 7);
        map_month.put("August", 8);
        map_month.put("September", 9);
        map_month.put("October", 10);
        map_month.put("November", 11);
        map_month.put("December", 12);

        for (Map.Entry<String, Integer> pairMonth : map_month.entrySet()) {
             if (pairMonth.getKey().equals(name_month)) {
                 System.out.println(pairMonth.getKey() + " is " + pairMonth.getValue() + " month");

             }
        }

    }

}
