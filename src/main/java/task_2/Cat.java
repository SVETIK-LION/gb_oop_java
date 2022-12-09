package task_2;


/**
 * Общий абстрактный класс для всех котов
 */
public abstract class Cat {
    private String mood;

    public Cat(String mood){
        this.mood = mood;
    }

    public String getMood(){
        return this.mood;
    }

    public void setMood (String newMood){
        System.out.printf("Новое настроение кота: %s\n", newMood);
        this.mood = newMood;
    }

    // Метод есть, но он не используется экземплярами класса Cat
    public String sharpenClawsOnToy(){
        setMood("Доволен когтеточкой");
        return "Какая классная когтеточка!";
    }


    public String runAway(){
        this.mood = "Испуган";
        return "Ой, как страшно! Надо найти укрытие О_О";
    }
}
