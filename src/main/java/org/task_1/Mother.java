package org.task_1;

import java.time.LocalDate;

public class Mother extends Grandmother{

    private String superSkill;
    public Mother(int idPerson, String familyStatus, String firstName, String lastName, String gender,
                  LocalDate birthdate, LocalDate deathdate, String biography, String eyesColor, String superSkill) {
        super(idPerson, familyStatus, firstName, lastName, gender, birthdate, deathdate, biography, eyesColor);
        this.superSkill = superSkill;
    }

    /**
     * Показать супер-способность
     * @return Возвращает интерполируемую строку
     */
    public String getSuperSkill(){
        return String.format("Cупер-способность: %s\n", this.superSkill);
    }
}
