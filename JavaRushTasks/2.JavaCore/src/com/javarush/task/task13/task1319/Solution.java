package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String fileName = bufferedReader.readLine(); // D:/Trash/test.txt
        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String rowFile = "";

        while (!(rowFile.equals("exit"))) {
                rowFile = bufferedReader.readLine();
                bufferedWriter.write(rowFile + System.lineSeparator());
                bufferedWriter.flush();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
