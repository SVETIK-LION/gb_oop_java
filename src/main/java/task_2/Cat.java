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

    public String sharpenClawsOnSofa(){
        return "Диван, я уничтожу тебя!";
    }

    public String sharpenClawsOnToy(){
        return "Какая удобная когтеточка";
    }

    public String runAway(){
        this.mood = "Испуган";
        return "Ой, как страшно! Надо найти укрытие О_О";
    }
}
