package org.example;


import java.time.LocalDate;


public class Person {
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

    public String getFamilyStatus(){
        return String.format("Семейный статус: %s\n", this.familyStatus);
    }

    public String getFirstName(){
        return String.format("Имя: %s\n", this.firstName);
    }

    public String getLastName(){
        return String.format("Фамилия: %s\n", this.lastName);
    }

    public String getGender(){
        return String.format("Пол: %s\n", this.gender);
    }

    public String getBirthdate(){
        return String.format("Дата рождения: %s\n", this.birthdate);
    }

    public String getDeathdate(){
        return String.format("Дата смерти: %s\n", this.deathdate);
    }

    public String getBiography(){
        return String.format("Биография: %s\n", this.biography);
    }


    public String getAllInfo(){
        return String.format("Семейный статус: %s\nИмя: %s\nФамилия: %s\nПол: %s\nДата рождения: %s\nДата смерти: %s\nБиография: %s\n",
                this.familyStatus, this.firstName, this.lastName, this.gender, this.birthdate, this.deathdate, this.biography);
    }






}
