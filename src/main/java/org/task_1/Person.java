package org.task_1;


import java.time.LocalDate;


public abstract class Person {
    // id в данной программе нигде не использую, но можно будет переделать с использованием БД, когда научусь, и id пригодится
    private int idPerson;
    private String familyStatus;
    private String firstName;
    private String lastName;
    private String gender; //Female, Male
    private LocalDate birthdate;
    private LocalDate deathdate;
    private String biography;


    public Person(int idPerson, String familyStatus, String firstName, String lastName, String gender, LocalDate birthdate,
                  LocalDate deathdate, String biography){

        this.idPerson = idPerson;
        this.familyStatus = familyStatus;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthdate = birthdate;
        this.deathdate = deathdate;
        this.biography = biography;
    }

    /**
     * Показать статус человека в семье
     * @return Возвращает интерполируемую строку
     */
    public String getFamilyStatus(){
        return String.format("Семейный статус: %s\n", this.familyStatus);
    }

    /**
     * Показать Имя
     * @return Возвращает интерполируемую строку
     */
    public String getFirstName(){
        return String.format("Имя: %s\n", this.firstName);
    }

    /**
     * Показать Фамилию
     * @return Возвращает интерполируемую строку
     */
    public String getLastName(){
        return String.format("Фамилия: %s\n", this.lastName);
    }

    /**
     * Показать пол
     * @return Возвращает интерполируемую строку
     */
    public String getGender(){
        return String.format("Пол: %s\n", this.gender);
    }

    /**
     * Показать дату рождения
     * @return Возвращает интерполируемую строку
     */
    public String getBirthdate(){
        return String.format("Дата рождения: %s\n", this.birthdate);
    }

    /**
     * Показать дату смерти (если человек жив, показывает настоящее время)
     * @return Возвращает интерполируемую строку
     */
    public String getDeathdate(){
        return String.format("Дата смерти/Настоящее время: %s\n", this.deathdate);
    }

    /**
     * Показать Биографию
     * @return Возвращает интерполируемую строку
     */
    public String getBiography(){
        return String.format("Биография: %s\n", this.biography);
    }

    /**
     * Показать возраст человека
     * @return Возвращает тип int - целое число
     */
    public int getAge(){
        System.out.print("Возраст: ");
        return this.deathdate.getYear() - this.birthdate.getYear();
    }

    /**
     * Показать всю основную информацию о человеке
     * @return Возвращает интерполируемую строку
     */
    public String getAllInfo(){
        return String.format("Семейный статус: %s\nИмя: %s\nФамилия: %s\nПол: %s\nДата рождения:" +
                        " %s\nДата смерти/Настоящее время: %s\nБиография: %s\n", this.familyStatus, this.firstName,
                this.lastName, this.gender, this.birthdate, this.deathdate, this.biography);
    }
}
