package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "Олег");
        map.put("2", "Иван");
        map.put("3", "Сергей");
        map.put("4", "Иван");
        map.put("5", "Саша");
        map.put("6", "Миша");
        map.put("7", "Олег");
        map.put("8", "Вова");
        map.put("9", "Вова");
        map.put("10", "Света");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        // создаю 2 клона
        HashMap<String,String> map2 = new HashMap<String, String>(map);
        HashMap<String,String> map3 = new HashMap<String, String>(map);

        // иду по первому клону (map2)
        for (Map.Entry<String, String> pair : map2.entrySet())
        {
            //стал на запись в первом клоне (map2) и удаляю ее во втором (map3)
            map3.remove(pair.getKey());

            // проверяю есть ли во втором клоне (map3) запись из (map2)
            if (map3.containsValue(pair.getValue()))
            {
                // если есть то удаляем из исходного (map) запись по значению (value)
                removeItemFromMapByValue(map, pair.getValue());
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
