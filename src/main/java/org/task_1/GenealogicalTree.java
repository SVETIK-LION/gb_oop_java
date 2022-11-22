package org.task_1;


import java.time.LocalDate;


/**
 * Генеологическое дерево конкретной семьи. Добавить новых членов можно через создание экземпляров классов.
 * Вывести основную информацию с помощью метода getAllInfo. Некоторые классы содержат собственные поля и методы.
 */
public class GenealogicalTree {
    public static void main(String[] args) {
        Grandmother grandmother = new Grandmother(1, "Бабушка со стороны матери", "Анна",
                "Львовская", "Женский", LocalDate.of(1934, 4, 18),
                LocalDate.of(2021, 5, 14),
                "Жена самого известного пекаря в деревне, владелица мельницы.", "Карий");

        Grandfather grandfather = new Grandfather(2, "Дедушка со стороны матери", "Сергей",
                "Львовский", "Мужской", LocalDate.of(1929, 6, 23),
                LocalDate.of(2010, 2, 17),
                "Известный пекарь, по его рецептам пекут и продают вкуснейшие пироги и хлеб.",
                "голубой");

        Mother mother = new Mother(3, "Мама","Ольга", "Храмова", "Женский",
                LocalDate.of(1954, 6, 19), LocalDate.now(),
                "Биолог. Подобрала особые белки для лекарства от рака, но потом заработала амнезию.",
                "Карий", "Фотографическая память");

        Father father = new Father(3, "Папа","Павел", "Храмов", "Мужской",
                LocalDate.of(1950, 9, 5), LocalDate.now(),
                "Физик. Открыл вечный двигатель, но правительство сказало уничтожить все следы под страхом смерти.",
                "Покладистый");

        Daughter daughter = new Daughter(1, "Дочь", "Анжела",
                "Храмова", "Женский", LocalDate.now(),
                LocalDate.of(2022, 1, 1),
                "Любит единорогов и сатан..цветы. В 5 классе выучила теорию поля.",
                "Серый", "Способности в математике", "Розовый");

        Son son = new Son(2, "Сын", "Платон", "Храмов", "Мужской",
                LocalDate.of(1980, 7, 11), LocalDate.now(),
                "Увлекается программированием, но работает в барбершопе. Мечтает быть таким, как отец.",
                "Импульсивный и вспыльчивый", "Программирование");


        // Посмотрим всю информацию про дедушку (наследник первых людей - Person), его возраст, и какой у него был цвет глаз
        System.out.println(grandfather.getAllInfo());
        System.out.println(grandfather.getAge());
        System.out.println(grandfather.getEyesColor());
        System.out.println("-----------------------------------------");

        // Теперь посмотрим про бабушку (тоже наследник Person)
        System.out.println(grandmother.getAllInfo());
        System.out.println(grandmother.getAge());
        System.out.println(grandmother.getEyesColor());
        System.out.println("-----------------------------------------");

        // У мамы бабушкины глаза (унаследовала getEyesColor от класса Grandmother). Только она еще более умная.
        // (у класса Mother появилось поле superSkill и метод getSuperSkill)
        System.out.println(mother.getAllInfo());
        System.out.println(mother.getAge());
        System.out.println(mother.getEyesColor());
        System.out.println(mother.getSuperSkill());
        System.out.println("-----------------------------------------");

        // Папа у нас из другой семьи - Храмовых (наследуется от Person), и у него есть свои особенности характера.
        // (Класс Father имеет свое новое поле character и метод getCharacter)
        System.out.println(father.getAllInfo());
        System.out.println(father.getAge());
        System.out.println(father.getCharacter());
        System.out.println("-----------------------------------------");

        // Дочь такая же талантливая, как мама, но направляет свои способности не туда. Ее любимый цвет - розовый.
        // А форма глаз все-таки в бабушку (Так как Mother наследуется от Grandmother)
        // (Класс Daughter наследуется от Mother, поэтому тоже имеет superSkills. Также появилось новое поле favoriteColor
        // и метод getFavoriteColor)
        System.out.println(daughter.getAllInfo());
        System.out.println(daughter.getAge());
        System.out.println(daughter.getEyesColor());
        System.out.println(daughter.getSuperSkill());
        System.out.println(daughter.getFavoriteColor());
        System.out.println("-----------------------------------------");

        // Сын - одновременно и творческая личность, и технарь, увлекается программированием
        // (в классе есть поле hobby и метод getHobby). Хочет быть похожим на отца, но абсолютная противоположность.
        // (Класс Son наследуется от Father, поэтому есть поле character и метод getCharacter, который переопределен.)
        System.out.println(son.getAllInfo());
        System.out.println(son.getAge());
        System.out.println(son.getCharacter());
        System.out.println(son.getHobby());

    }
}
