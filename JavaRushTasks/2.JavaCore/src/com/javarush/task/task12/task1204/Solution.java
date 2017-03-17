package com.javarush.task.task12.task1204;

/* 
Или «Кошка», или «Собака», или «Птица», или «Лампа»
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение
       String result = "";
       if (o instanceof Cat) { result = "Кошка"; }
       else if (o instanceof Bird) { result = "Птица"; }
       else if (o instanceof Lamp) { result = "Лампа"; }
       else if (o instanceof Cat)  { result = "Кошка"; }
       else if (o instanceof Dog)  { result = "Собака"; }
        System.out.println(result);
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
