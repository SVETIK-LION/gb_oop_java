package org.svetik;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Toy> toyWarehouse = new ArrayList<>();
        ArrayList<Toy> prizeToys = new ArrayList<>();
        Editing editing = new Editing();

        while (true) {
            System.out.println("-------- Выберите пункт меню --------");
            System.out.println("1 - Добавить игрушку на склад");
            System.out.println("2 - Изменить частоту выпадения игрушки");
            System.out.println("3 - Выбрать призовую игрушку");
            System.out.println("4 - Выдать игрушку");
            System.out.println("5 - Показать все игрушки на складе");
            System.out.println("6 - Показать все призовые игрушки");
            System.out.println("7 - Выход");

            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();

            switch (line) {
                case "1" -> editing.addToy(toyWarehouse);
                case "2" -> editing.updateWinFrequency(toyWarehouse);
                case "3" -> editing.choosePrizeToy(toyWarehouse, prizeToys);
                case "4" -> editing.getPrizeToy(prizeToys);
                case "5" -> editing.displayAllWarehouse(toyWarehouse);
                case "6" -> editing.displayAllPrizes(prizeToys);
                case "7" -> {
                    System.out.println("До свидания!");
                    System.exit(0);

                }
            }
        }
    }
}
