package InformationSystemUniversity;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherEditing implements Editing {


    public boolean isExistInGroup(ArrayList<Student> arrayGroup, String idStudent) {
        for (Student student : arrayGroup) {
            if (student.getId().equals(idStudent)) {
                System.out.println("Этот студент уже добавлен в группу");
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean isFound(ArrayList<Student> arrayStudent, String idStudent) {
        for (Student student : arrayStudent) {
            return student.getId().equals(idStudent);
        }
        System.out.println("Такого студента нет в списке студентов");
        return false;
    }

    public void addToGroup(ArrayList<Student> arrayStudent, ArrayList<Student> arrayGroup) {
        System.out.println("Введите id студента, которого нужно добавить в группу: ");
        Scanner scanner = new Scanner(System.in);
        String idStudent = scanner.nextLine();
        boolean exist = isExistInGroup(arrayGroup, idStudent);
        if (isFound(arrayStudent, idStudent)) {
            if (!exist) {
                for (Student student : arrayStudent) {
                    if (student.getId().equals(idStudent)) {
                        arrayGroup.add(student);
                        System.out.println("Студент добавлен в Вашу группу");
                    }
                }
            } else {
                System.out.println("Такой студент уже есть в Вашей группе");
            }
        } else {
            System.out.println("Такого студента на факультете нет");
        }
    }


    public void delFromGroup(ArrayList<Student> arrayGroup) {
        System.out.println("Введите id студента, которого нужно удалить из группы: ");
        Scanner scanner = new Scanner(System.in);
        String idStudent = scanner.nextLine();

        for (Student student : arrayGroup) {
            if (student.getId().equals(idStudent)) {
                arrayGroup.remove(student);
                System.out.println("Студент успешно удален");
                break;
            } else {
                System.out.println("Такого студента нет");
            }
        }
    }

    @Override
    public void displayAll(ArrayList<Student> arrayGroup) {
        if (arrayGroup.size() == 0) {
            System.out.println("Студентов в группе нет\n");
        } else {
            System.out.println("Студенты в Вашей группе: ");
            System.out.println("| id | Имя и Фамилия | Возраст | Специальность |");

            for (Student student : arrayGroup) {
                System.out.println(" | " + student.getId() + " | " + student.getName() + " | " + student.getAge() + " | "
                        + student.getSpeciality() + " | ");
            }

        }
    }
}

