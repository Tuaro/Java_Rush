package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
       ArrayList<String> [] arrayLists = new ArrayList[3];

       ArrayList<String> list1 = new ArrayList<String>();
       ArrayList<String> list2 = new ArrayList<String>();
       ArrayList<String> list3 = new ArrayList<String>();

        for (int i = 1; i < 10; i++) {
            list1.add("aa");
            list2.add("bb");
            list3.add("cc");
        }
        arrayLists[0] = list1;
        arrayLists[1] = list2;
        arrayLists[2] = list3;

        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}