package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
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

       String name1, name2;
       name1 = bufferedReader.readLine();
       name2 = bufferedReader.readLine();
       int len1, len2;
       len1 = name1.length();
       len2 = name2.length();

       if (name1.equals(name2) ) System.out.println("Имена идентичны");
         else if (len1 == len2) System.out.println("Длины имен равны");
    }
}
