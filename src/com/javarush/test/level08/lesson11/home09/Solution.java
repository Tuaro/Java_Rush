package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static boolean isDateOdd(String date)
    {

        Date dates = new Date(date); // создаем объект текущая дата

        long finish = dates.getTime(); // получаем текущую дату в милисекундах
        dates.setDate(1); // устанавливаем первый день месяца
        dates.setMonth(0); // устанавливаем первый месяц (нумерация месяцев с нуля)
        long start = dates.getTime(); // для первого дня первого месяца получаем время в милисекундах
        long dif = finish - start; // разница между началом года и текущей датой в милисекундах
        long msDay = 1000 * 60 *60 *24; // вычисляем кол -во милисекнд в день
        int dayCount = (int)(dif / msDay); // вычисляем кол-во дней с начала года и переводим из long в int
        if(dayCount % 2 == 0) return true; // проверяем четность
        else return false;


    }
}
