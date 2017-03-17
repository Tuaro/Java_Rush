package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
       private String name;
       private int age;
       private double heigth;
       private double weigth;
       private boolean gender;
       private boolean married;

// 1
       public Human ()
        {
            age = 20;
            weigth = 50;
            heigth = 170;
        }

// 2
       public Human (String name, int age, double heigth, double weigth, boolean gender, boolean married) {
            this.name = name;
            this.age = age;
            this.heigth = heigth;
            this.weigth = weigth;
            this.gender = gender;
            this.married = married;
        }
// 3
public  Human (String name, boolean gender)
        {
          this.name = name;
          this.gender = gender;
        }
// 4
public  Human (int weigth, int heigth)
        {
            this.weigth = weigth;
            this.heigth = heigth;
        }
// 5
public  Human (boolean married)
        {
            this.married = married;
        }
//6
public  Human (String name, int age, boolean married)
        {
          this.name = name;
          this.age = age;
          this.married = married;
        }
//7
public  Human (int age, double heigth, double weigth )
        {
            this.age = age;
            this.heigth = heigth;
            this.weigth = weigth;
        }
// 8
public  Human (boolean gender, int age)
        {
          this.gender = gender;
          this.age = age;
        }
//9
public  Human (int age, boolean gender, boolean married) {
            this.age = age;
            this.gender = gender;
            this.married = married;
        }
//10
public  Human (String name, double weigth, double heigth) {
            this.name = name;
            this.weigth = weigth;
            this.heigth = heigth;

        }

    }
}
