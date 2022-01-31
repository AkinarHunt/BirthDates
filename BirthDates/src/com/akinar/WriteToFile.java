package com.akinar;

import java.io.*;
import java.util.Scanner;

public class WriteToFile {
    public static void saveInf() throws IOException {
        BufferedReader br = null;

        Scanner name = new Scanner(System.in);
        System.out.print("Введите Фамилию и имя: ");
        String birthname = name.nextLine();
        Scanner date = new Scanner(System.in);
        System.out.print("Введите дату рождения: ");
        String birthdate = date.nextLine();



        File file = new File("SavedData.txt");
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(file, true));
            writer.println(birthdate + " " + birthname);
            writer.flush();
            writer.close();


        }catch(IOException ex){
                ex.printStackTrace();
            }



    }
}
