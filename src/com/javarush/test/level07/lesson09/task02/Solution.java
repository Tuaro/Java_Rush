package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        ArrayList<String> listString = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
         listString.add(bufferedReader.readLine());
        }

        listString.remove(2);

        for (int i = listString.size() - 1; i >= 0; i--) {
            System.out.println(listString.get(i));

        }



    }
}
