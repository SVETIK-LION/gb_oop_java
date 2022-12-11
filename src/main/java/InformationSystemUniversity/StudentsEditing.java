package InformationSystemUniversity;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentsEditing implements Editing{
    // Объявила массив, содержащий экземпляры класса Student вне методов, чтобы он не затирался
    ArrayList<Student> studentInfo = new ArrayList<>();

    /**
     * Запрашивает данные студента и добавляет его в базу
     */
    @Override
    public void add() throws Exception{
        Scanner scanner = new Scanner(System.in);
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

        // Тут будет записываться файл массив, содержащий данные студентов, преобразованный в строку (перезапись файла)
        FileWriter fw = new FileWriter("students.txt", false);
        fw.write(studentInfo.toString() + "\n");

        // Закрываем writer
        fw.close();

        System.out.println("Студент добавлен в базу");
    }

    @Override
    public void change() {

    }

    @Override
    public void del() {

    }

    @Override
    public void displayAll() throws Exception{
        FileReader fr = new FileReader("Students.txt");
        Scanner frScanner = new Scanner(fr);

        int number = 1;

        while (frScanner.hasNextLine()) {
            System.out.println("number" + ") " + frScanner.nextLine());
            number ++;
        }
        fr.close();
    }

    /**
     * Записывает студента в группу
     */
    public void writeToGroup() throws Exception {
        FileReader fr = new FileReader("Students.txt");
        Scanner frScanner = new Scanner(fr);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите идентификатор студента: ");
        String student_id = scanner.nextLine();
        System.out.println("Введите номер группы: ");
        String group_id = scanner.nextLine();

    }
}
