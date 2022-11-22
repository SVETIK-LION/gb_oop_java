package task_2;

public class Cat {
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

    public String sharpenClawsOnSofa(){
        setMood("Доволен подранным диваном");
        return "Диван, я уничтожу тебя!";
    }


    public String runAway(){
        this.mood = "Испуган";
        return "Ой, как страшно! Надо найти укрытие О_О";
    }

    public String begSausage() {
        setMood("Спокойное настроение");
        return "М-м-м, колбаска! Мур-мур-мур!!! Дай мне колбаску!";
    }

}
