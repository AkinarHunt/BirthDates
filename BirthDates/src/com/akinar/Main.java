package com.akinar;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        LoadFromFile load = new LoadFromFile();
        load.showInf();

        Menu md = new Menu();
        WriteToFile save = new WriteToFile();


	// Menu
        int userSelected;
        do {
            userSelected = md.MenuData();
            switch (userSelected) {
                case 1:
                    load.showInf();
                break;
                case 2:
                    save.saveInf();
                break;
                case 3:
                    System.out.println("Функция в разработке");
                break;
                case 4:
                    System.out.println("Функиця в разработке");
                break;
                case 5:
                    System.out.println("До новых встреч!");
                break;
                default:
                break;
            }
        }
        while(userSelected > 5);

    }



}
