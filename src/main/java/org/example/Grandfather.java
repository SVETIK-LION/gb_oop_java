package org.example;

import java.time.LocalDate;

public class Grandfather extends Person {
    private String eyesColor;
    public Grandfather(int idPerson, String familyStatus, String firstName, String lastName, String gender,
                       LocalDate birthdate, LocalDate deathdate, String biography, String eyesColor) {
        super(idPerson, familyStatus, firstName, lastName, gender, birthdate, deathdate, biography);
        this.eyesColor = eyesColor;
    }

    /**
     * Показать цвет глаз
     * @return Возвращает интерполируемую строку
     */
    public String getEyesColor(){
        return String.format("Цвет глаз - %s\n", this.eyesColor);
    }
}
