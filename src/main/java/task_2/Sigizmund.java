package task_2;


/**
 * Конкретный кот Сигизмунд. Наследуется от абстрактного класса Cat, берет стандартные "котовские" методы оттуда.
 * Реализует интерфейс Actions, из которого переопределяет методы хороших и плохих событий.
 */

public class Sigizmund extends Cat implements Actions{
    public Sigizmund(String mood) {
        super(mood);
    }

    @Override
    public String badAction() {
        setMood("Доволен подранным диваном");
        return "Диван, я уничтожу тебя!";
    }

    @Override
    public String goodAction() {
        setMood("Спокойное настроение");
        return "М-м-м, колбаска! Мур-мур-мур!!! Дай мне колбаску!";
    }
}
