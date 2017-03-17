package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        String fileName = bufferedReader.readLine();


        InputStream inputFile = new FileInputStream(fileName); // "D:/Trash/test.txt"

        while (inputFile.available() > 0) {
            char data = (char) inputFile.read();
            System.out.print(data);
        }
        System.out.println();

        bufferedReader.close();
        inputFile.close();
    }
}