package task_2;

public class Cat {
    private String mood;

    public Cat(String mood){
        this.mood = mood;
    }

    public String getMood(){
        System.out.println("Настроение кота:");
        return this.mood;
    }

    public void setMood (String newMood){
        System.out.println("Новое настроение кота:");
        this.mood = newMood;
    }

    public String sharpenClawsOnSofa(){
        return "Диван, я уничтожу тебя!";
    }

    public String sharpenClawsOnToy(){
        return "Какая удобная когтеточка";
    }
}
