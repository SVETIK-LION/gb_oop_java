package org.example;

import java.time.LocalDate;


public class GenealogicalTree {
    public static void main(String[] args) {
        Person grandmother = new Person(1, "Бабушка со стороны матери", "Анна", "Львовская",
                "Женский", LocalDate.of(1934, 4, 18),
                LocalDate.of(201, 5, 14),
                "Жена самого известного пекаря в деревне, владелица мельницы");

        Person grandfather = new Person(2, "Дедушка со стороны матери", "Сергей", "Львовский", "Мужской",
                LocalDate.of(1929, 6, 23), LocalDate.of(2005, 2, 17),
                "Известный пекарь, по его рецептам пекут и продают вкуснейшие пироги и хлеб.");

        Person mother = new Person(3, "Мама","Ольга", "Храмова", "Женский",
                LocalDate.of(1954, 6, 19), LocalDate.of(2034, 1, 2),
                "Биолог. Подобрала особые белки для лекарства от рака");

        Person father = new Person(3, "Папа","Павел", "Храмов", "Мужской",
                LocalDate.of(1950, 9, 5), LocalDate.of(2035, 6, 3),
                "Физик. Открыл вечный двигатель");

        Person daughter = new Person(1, "Бабушка со стороны матери", "Анна", "Львовская",
                "Женский", LocalDate.of(1934, 4, 18),
                LocalDate.of(201, 5, 14),
                "Жена самого известного пекаря в деревне, владелица мельницы");

        Person son = new Person(2, "Дедушка со стороны матери", "Сергей", "Львовский", "Мужской",
                LocalDate.of(1929, 6, 23), LocalDate.of(2005, 2, 17),
                "Известный пекарь, по его рецептам пекут и продают вкуснейшие пироги и хлеб.");


        System.out.println(grandfather.getAllInfo());


    }
}