package task_2;

public class Human {
    private String handsObject;
    private String faceExpression;

    public Human (String handsObject, String faceExpression){
        this.handsObject = handsObject;
        this.faceExpression = faceExpression;
    }

    public String getFaceExpression(){
        return this.faceExpression;
    }


    public String getHandsObject(){
        return this.handsObject;
    }

    public void setFaceExpression(String newFaceExpression){
        System.out.printf("Новое выражение лица человека: %s", newFaceExpression);
        this.faceExpression = newFaceExpression;
    }

    public void setHandsObject(String newHandsObject){
        System.out.printf("Теперь в руках у человека: %s\n", newHandsObject);
        this.handsObject = newHandsObject;
    }

    public void takeFood(){
        setHandsObject("Колбаска");
    }

    public void takeWeapons(){
        setHandsObject("Палка");
    }

    /**
     * Похвалить кота и дать колбаску
     * @return Строка, которая описывает происшествие
     */
    public String praiseCat(){
        setFaceExpression("Доброе лицо\n");
        takeFood();
        return "А кто у нас такой хороший котик? Ути-пути, мой мохнатый пирожочек ^_^";
    }

    /**
     * Просто побранить кота, но не особо охотно, без угрожающей палки
     * @return Строка, которая описывает происшествие
     */
    public String scoldCat(){
        setFaceExpression("Недовольное лицо\n");
        return "Плохой кот, плохой! Так нельзя делать, бу-бу-бу!";
    }

    /**
     * Наорать на кота с угрозой применения палки
     * @return Строка, которая описывает происшествие
     */
    public String scoldCatWithWeapons(){
        setFaceExpression("Очень злое лицо\n");
        takeWeapons();
        return "Ах ты, варежка! Ну ты у меня сейчас получишь вот этой палкой!";
    }
}
