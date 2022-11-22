package org.task_1;

import java.time.LocalDate;

public class Daughter extends Mother{

    private String favoriteColor;
    public Daughter(int idPerson, String familyStatus, String firstName, String lastName, String gender,
                    LocalDate birthdate, LocalDate deathdate, String biography, String eyesColor, String superSkill,
                    String favoriteColor) {
        super(idPerson, familyStatus, firstName, lastName, gender, birthdate, deathdate, biography, eyesColor, superSkill);
        this.favoriteColor = favoriteColor;
    }

    /**
     * Показать любимый цвет
     * @return Возвращает интерполируемую строку
     */
    public String getFavoriteColor() {
        return String.format("Любимый цвет: %s\n", this.favoriteColor);
    }
}

