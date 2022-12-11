package InformationSystemUniversity;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
        fw.write(studentInfo + "\n");

        // Закрываем writer
        fw.close();

        System.out.println("Студент добавлен в базу");
    }

    @Override
    public void change() {
        // TODO Изменение записи

    }

    @Override
    public void del() throws Exception{
        FileReader fr = new FileReader("Students.txt");
        Scanner frScanner = new Scanner(fr);
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем id студента:
        System.out.println("Введите id студента для удаления: ");
        String id = scanner.nextLine();


        // Читаем из файла и перебираем циклом. Берем id студента и сравниваем с введенным. Если совпадает, то удаляем.
        while (frScanner.hasNextLine()) {
           String str_student = frScanner.nextLine();
           String [] lst_student = str_student.split(" ");
           String student_id = Arrays.asList(lst_student).get(0);
           //TODO Тут надо уточнить, какой разделитель split, TODO так как не поняла, как "склеивается" массив при записи в файл.

            if(id.equals(student_id)){
                //TODO Если совпадают, то как-то удаляется
            }

        }
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
        // TODO Добавление в группу
        System.out.println("Введите идентификатор студента: ");
        String student_id = scanner.nextLine();
        System.out.println("Введите номер группы: ");
        String group_id = scanner.nextLine();

    }
}
