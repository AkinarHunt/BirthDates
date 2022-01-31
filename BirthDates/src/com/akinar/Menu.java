package com.akinar;

import java.util.Scanner;

public class Menu {
    public static int MenuData() {
        int selection;
        Scanner sc = new Scanner(System.in);
        System.out.println("Меню");
        System.out.println("==============");
        System.out.println("1 - Показать полный список Дней рождения");
        System.out.println("2 - Добавить новый День рождения");
        System.out.println("3 - Удалить запись");
        System.out.println("4 - Редактировать запись");
        System.out.println("5 - Выход");
        System.out.println("==============");
        System.out.print("Выберите пункт меню: ");
        selection = sc.nextInt();
        return selection;
    }
}
