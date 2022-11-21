package org.example;

import java.time.LocalDate;

public class Son extends Father{

    private String hobby;
    public Son(int idPerson, String familyStatus, String firstName, String lastName, String gender, LocalDate birthdate,
               LocalDate deathdate, String biography, String character, String hobby) {
        super(idPerson, familyStatus, firstName, lastName, gender, birthdate, deathdate, biography, character);
        this.hobby = hobby;
    }

    /**
     * Показать характер. Метод переопределен.
     * @return Возвращает интерполируемую строку, отличную от оригинального метода.
     */
    @Override
    public String getCharacter() {
        return String.format("Сделаю все по-своему! Ведь мой характер, в отличие от отца: %s", super.character);
    }

    /**
     * Показать хобби
     * @return Возвращает интерполируемую строку
     */
    public String getHobby(){
        return String.format("Хобби: %s\n", this.hobby);
    }
}
