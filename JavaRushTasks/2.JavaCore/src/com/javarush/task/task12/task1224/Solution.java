package com.javarush.task.task12.task1224;

/* 
Что это? «Кот», «Тигр», «Лев», «Бык», «хз»
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        String result = "";

        if (o instanceof Cat) {
          result = "Кот";
        }
        else if (o instanceof Tiger) {
            result = "Тигр";
        }
        else if (o instanceof Lion) {
            result = "Лев";
        }
        else if (o instanceof Bull) {
            result = "Бык";
        }
        else result = "хз";
        return result;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
