package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*
        //list of addresses
        List<String> addresses = new ArrayList<String>();
        while (true)
        {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }

        //read home number
        int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < addresses.size())
        {
            String familySecondName = addresses.get(houseNumber);
            System.out.println(familySecondName);
        }
        */

        Map<String, String> mapCityFamily = new HashMap<String, String>(); // создаем коллекцию Map

        // заполняем коллекцию
        //System.out.println("Заполняем коллекцию. Семья - Город.");
        while (true) {
          String city = reader.readLine();
           if (city.isEmpty()) break;

          String family = reader.readLine();
          mapCityFamily.put(city, family);
          //  System.out.println(city + " - " + family);
        }


        // Запрашиваем город
        //System.out.println("Запрашиваем город.");
        String town = reader.readLine();

        // Выводим семьи
        //System.out.println("Выводим семьи.");
        for (Map.Entry<String, String> pair : mapCityFamily.entrySet()) {
            if (pair.getKey().equals(town)) System.out.println(pair.getValue());
        }

    }
}
