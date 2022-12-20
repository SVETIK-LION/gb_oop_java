package InformationSystemUniversity;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arrayStudent = new ArrayList<>();
        StudentsEditing studentsEditing = new StudentsEditing();

        while (true) {
            System.out.println("-------- Выберите пункт меню --------");
            System.out.println("1 - Добавить студента");
            System.out.println("2 - Удалить студента");
            System.out.println("3 - Изменить информацию о студенте");
            System.out.println("4 - Показать всех студентов");
            System.out.println("5 - Выход");

            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();

            switch (line) {
                case "1" -> studentsEditing.add(arrayStudent);
                case "2" -> studentsEditing.delete(arrayStudent);
                case "3" -> studentsEditing.update(arrayStudent);
                case "4" -> studentsEditing.displayAll(arrayStudent);
                case "5" -> {
                    System.out.println("До свидания!");
                    System.exit(0);
                }
            }
        }

    }
}
