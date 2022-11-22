package org.task_1;

import java.time.LocalDate;

public class Father extends Person{

    protected String character;
    public Father(int idPerson, String familyStatus, String firstName, String lastName, String gender,
                  LocalDate birthdate, LocalDate deathdate, String biography, String character) {
        super(idPerson, familyStatus, firstName, lastName, gender, birthdate, deathdate, biography);
        this.character = character;
    }

    /**
     * Показать характер
     * @return Возвращает интерполируемую строку
     */
    public String getCharacter(){
        return String.format("Характер: %s\n", this.character);
    }
}
