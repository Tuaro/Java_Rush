package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        ArrayList<int[]> result = new ArrayList<int[]>();
        int [] array5 = new int[5];
        array5[0] = 0;
        array5[1] = 1;
        array5[2] = 2;
        array5[3] = 3;
        array5[4] = 4;

        int [] array2 = new int[2];
        array2[0] = 0;
        array2[1] = 1;

        int [] array4 = new int[4];
        array4[0] = 0;
        array4[1] = 1;
        array4[2] = 2;
        array4[3] = 3;

        int [] array7 = new int[7];
        array7[0] = 0;
        array7[1] = 1;
        array7[2] = 2;
        array7[3] = 3;
        array7[4] = 4;
        array7[5] = 5;
        array7[6] = 6;

        int [] array0 = new int[0];

        result.add(array5);
        result.add(array2);
        result.add(array4);
        result.add(array7);
        result.add(array0);

        return result;

    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
