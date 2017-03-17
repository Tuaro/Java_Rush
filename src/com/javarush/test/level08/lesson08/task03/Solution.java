package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{

    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> myMap = new HashMap<String, String>();
        myMap.put("1", "oo");
        myMap.put("qwe", "dd");
        myMap.put("ty", "dd");
        myMap.put("fg", "oo");
        myMap.put("vbc", "d");
        myMap.put("jhg", "dddddddddd");
        myMap.put("xzc", "fffffffff");
        myMap.put("mnb", "gggg");
        myMap.put("kl", "oo");
        myMap.put("11", "oo");

        return myMap;

    }


    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int countTheSameFirstName = 0;
        Iterator<Map.Entry<String, String>> myIterator = map.entrySet().iterator();

         while (myIterator.hasNext()) {
             Map.Entry<String, String> pair = myIterator.next();
             if (pair.getValue().equals(name)) {
                 countTheSameFirstName = countTheSameFirstName + 1;
             }
         }
        return countTheSameFirstName;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int countTheSameLastName = 0;
        Iterator<Map.Entry<String, String>> myIterator = map.entrySet().iterator();

        while (myIterator.hasNext()) {
            Map.Entry<String, String> pair = myIterator.next();
            if (pair.getKey().equals(lastName)) {
                countTheSameLastName = countTheSameLastName + 1;
            }
        }

        return countTheSameLastName;

    }
}
