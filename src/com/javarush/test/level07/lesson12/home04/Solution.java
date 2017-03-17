package com.javarush.test.level07.lesson12.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> listString = new ArrayList<String>();
        boolean isEnd = false;
        String readLine = "";

        while (isEnd == false) {
            readLine = reader.readLine();
            isEnd = readLine.equals("end");
            if (isEnd == false)
            {
                listString.add(readLine);
            }
             else break;
        }

        for (int i = 0; i < listString.size(); i++) {
            System.out.println(listString.get(i));
        }
    }
}
