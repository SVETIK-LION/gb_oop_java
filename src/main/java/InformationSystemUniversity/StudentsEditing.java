package InformationSystemUniversity;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentsEditing implements Editing {
    // Проверяет, существует ли уже запись о студенте с таким id
    public boolean isExist(ArrayList<Student> arrayStudent, String id) {
        boolean flag = false;

        for (Student student : arrayStudent) {
            if (student.getId().equals(id)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    // Добавляет студента
    public void add(ArrayList<Student> arrayStudent) {
        Scanner scanner = new Scanner(System.in);
        String id;

        while (true) {
            System.out.println("Введите id студента");
            id = scanner.nextLine();

            boolean flag = isExist(arrayStudent, id);
            if (flag) {
                System.out.println("Студент с таким id уже существует, повторите ввод: ");
            } else {
                break;
            }
        }

        System.out.println("Введите имя и фамилию студента через пробел: ");
        String firstLastName = scanner.nextLine();
        System.out.println("Введите возраст студента: ");
        String ageStudent = scanner.nextLine();
        System.out.println("Введите специальность студента: ");
        String specialityStudent = scanner.nextLine();

        Student student = new Student();
        student.setId(id);
        student.setName(firstLastName);
        student.setAge(ageStudent);
        student.setSpeciality(specialityStudent);

        arrayStudent.add(student);

        System.out.println("Студент успешно добавлен\n");
    }

    // Изменяет информацию о студенте
    public void update(ArrayList<Student> arrayStudent) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id студента, данные которого нужно изменить: ");
        String id = scanner.nextLine();

        System.out.println("Введите новые Имя и Фамилию студента через пробел: ");
        String firstLastName = scanner.nextLine();

        System.out.println("Введите новый возраст студента: ");
        String age = scanner.nextLine();

        System.out.println("Введите новую специальность студента: ");
        String speciality = scanner.nextLine();

        Student student = new Student();
        student.setId(id);
        student.setName(firstLastName);
        student.setAge(age);
        student.setSpeciality(speciality);

        for (int i = 0; i < arrayStudent.size(); i++){
            Student oneStudent = arrayStudent.get(i);
            if(oneStudent.getId().equals(id)){
                arrayStudent.set(i, student);
                break;
            }
        }
        System.out.println("Информация о студенте успешно изменена\n");
    }

    // Удаляет студента
    public void delete(ArrayList<Student> arrayStudent) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id студента, которого нужно удалить: ");
        String id = scanner.nextLine();

        int idx = -1;
        for(int i = 0; i < arrayStudent.size(); i++){
            Student student = arrayStudent.get(i);
            if(student.getId().equals(id)){
                idx = i;
                break;
            }
        }
        if (idx == -1){
            System.out.println("Студента с таким id нет, повторите ввод: ");
        } else {
            arrayStudent.remove(idx);
            System.out.println("Студент удален успешно\n");
        }


    }

    @Override
    // Показывает всех студентов
    public void displayAll(ArrayList<Student> arrayStudent) {
        if (arrayStudent.size() == 0) {
            System.out.println("Студентов нет\n");
            return;
        }

        System.out.println("Студенты на факультете:");
        System.out.println("| id | Имя и Фамилия | Возраст | Специальность |");

        for (Student student : arrayStudent) {
            System.out.println(" | " + student.getId() + " | " + student.getName() + " | " + student.getAge() + " | "
                    + student.getSpeciality() + " | ");
        }

    }
}
