package com.akinar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoadFromFile {
    public static void showInf() throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("SavedData.txt"));
            String line;
            System.out.println("Список известных дней рождения:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e) {
            System.out.print("Error " + e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.print("Error " + e);
            }
        }
    }
}
