package InformationSystemUniversity;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentsEditing implements Editing{

    @Override
    public void add() throws Exception{
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentInfo = new ArrayList<>();
        Student student = new Student();

        // Запрашиваем у пользователя данные студента и записываем их в экземпляр класса Student
        System.out.println("Введите идентификатор студента: ");
        student.setId(scanner.nextLine());
        System.out.println("Введите имя и фамилию студента: ");
        student.setName(scanner.nextLine());
        System.out.println("Введите возраст студента: ");
        student.setAge(scanner.nextLine());
        System.out.println("Введите специальность студента: ");
        student.setSpeciality(scanner.nextLine());

        // Добавляем экземпляр класса Student в массив
        studentInfo.add(student);

        // Тут будет дописываться в файл массив, содержащий данные студентов, преобразованный в строку
        FileWriter fw = new FileWriter("students.txt");
        fw.write(studentInfo.toString());

        // закрываем writer
        fw.close();


//        // Начинаем запрашивать у пользователя данные и формировать массив
//        System.out.println("Введите идентификатор студента: ");
//        studentInfo.add(scanner.nextLine() + ", ");
//        System.out.println("Введите имя и фамилию студента: ");
//        studentInfo.add(scanner.nextLine() + ", ");
//        System.out.println("Введите возраст студента: ");
//        studentInfo.add(scanner.nextLine() + ", ");
//        System.out.println("Введите специальность студента: ");
//        studentInfo.add(scanner.nextLine() + ", ");


    }

    @Override
    public void change() {

    }

    @Override
    public void del() {

    }

    @Override
    public void displayAll() {

    }
}
