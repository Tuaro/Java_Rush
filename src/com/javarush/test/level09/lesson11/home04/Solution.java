package com.javarush.test.level09.lesson11.home04;

import sun.util.calendar.LocalGregorianCalendar;

import java.io.BufferedReader;
import java.io.DataInput;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        Date date1 = new Date(bufferedReader.readLine());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy");
        System.out.println(simpleDateFormat.format(date1).toUpperCase());
    }
}
