package org.svetik;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Editing {

    public boolean isExist(ArrayList<Toy> toysWarehouse, int toyId) {
        boolean flag = false;

        for (Toy toy : toysWarehouse) {
            if (toy.getToyId() == toyId) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void addToy(ArrayList<Toy> toysWarehouse) {
        Scanner scanner = new Scanner(System.in);
        int toyId;

        while (true) {
            System.out.println("Введите id - номер игрушки");
            toyId = scanner.nextInt();

            boolean flag = isExist(toysWarehouse, toyId);
            if (flag) {
                System.out.println("Игрушка с таким id уже есть на складе, повторите ввод: ");
            } else {
                break;
            }
        }

        System.out.println("Введите название игрушки: ");
        String toyName = scanner.next();

        System.out.println("Введите частоту выпадения игрушки в процентах (1-100): ");
        int winFrequency = scanner.nextInt();

        if (0 < winFrequency && winFrequency <= 100){
            Toy toy = new Toy();

            toy.setToyId(toyId);
            toy.setToyName(toyName);
            toy.setWinFrequency(winFrequency);

            toysWarehouse.add(toy);
            System.out.println("Игрушка добавлена на склад\n");
        } else {
            System.out.println("Нужно ввести число от 1 до 100 - частоту выпадения в процентах");
        }


    }

    public void updateWinFrequency(ArrayList<Toy> toysWarehouse) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id игрушки для изменения ее частоты выпадения: ");
        int toyId = scanner.nextInt();

        System.out.println("Введите новую частоту выпадения игрушки: ");
        int newWinFrequency = scanner.nextInt();


        for (Toy oneToy : toysWarehouse) {
            if (oneToy.getToyId() == toyId) {
                oneToy.setWinFrequency(newWinFrequency);
                break;
            }
        }
        System.out.println("Частота выпадения игрушки изменена\n");
    }

    public void choosePrizeToy(ArrayList<Toy> toysWarehouse, ArrayList<Toy> prizeToys) {
        int largeWinFrequency = 0;

        if (toysWarehouse.size() == 0) {
            System.out.println("Игрушек на складе больше нет");
            return;
        }

        for (Toy oneToy : toysWarehouse) {
            if (oneToy.getWinFrequency() >= largeWinFrequency) {
                largeWinFrequency = oneToy.getWinFrequency();
            }
        }

        for (int i = 0; i < toysWarehouse.size(); i++) {
            Toy oneToy = toysWarehouse.get(i);

            if (oneToy.getWinFrequency() == largeWinFrequency) {
                prizeToys.add(oneToy);
                toysWarehouse.remove(oneToy);
                System.out.println("Призовая игрушка выбрана и добавлена в призы");
            }
        }
    }

    public void getPrizeToy(ArrayList<Toy> prizeToys) {
        if (prizeToys.size() > 0){
            String toyId = prizeToys.get(0).getToyId() + "\n";
            try{
                FileWriter writer = new FileWriter("issued_toys.txt", false);
                BufferedWriter bufferWriter = new BufferedWriter(writer);
                bufferWriter.write(toyId);
                bufferWriter.close();

                System.out.println("Приз выдан");
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
            prizeToys.remove(prizeToys.get(0));
        } else {
            System.out.println("Больше нет игрушек для лотереи");
        }
    }

    public void displayAllWarehouse(ArrayList<Toy> toysWarehouse) {
        if (toysWarehouse.size() == 0) {
            System.out.println("Игрушек на складе нет\n");
            return;
        }

        System.out.println("| id | Название | Частота |");

        for (Toy toy : toysWarehouse) {
            System.out.println(" | " + toy.getToyId() + " | " + toy.getToyName() + " | " + toy.getWinFrequency() + " | ");
        }
    }

    public void displayAllPrizes(ArrayList<Toy> prizeToys) {
        if (prizeToys.size() == 0) {
            System.out.println("Призовых игрушек нет\n");
            return;
        }

        System.out.println("| id | Название | Частота |");

        for (Toy toy : prizeToys) {
            System.out.println(" | " + toy.getToyId() + " | " + toy.getToyName() + " | " + toy.getWinFrequency() + " | ");
        }
    }

}
