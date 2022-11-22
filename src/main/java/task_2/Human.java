package task_2;

public class Human {
    private String handsObject;
    private String faceExpression;

    public Human (String handsObject, String faceExpression){
        this.handsObject = handsObject;
        this.faceExpression = faceExpression;
    }

    public String getFaceExpression(){
        System.out.println("Выражение лица человека:");
        return faceExpression;
    }

    public String getHandsObject(){
        System.out.println("В руках у человека:");
        return handsObject;
    }

    public void setFaceExpression(String newFaceExpression){
        System.out.println("Новое выражение лица человека:");
        this.faceExpression = newFaceExpression;
    }

    public void setHandsObject(String newHandsObject){
        System.out.println("Теперь в руках у человека:");
        this.handsObject = newHandsObject;
    }

//    public String toUpset(){
//        setFaceExpression("Грустное лицо");
//        return "Человек расстроился";
//    }
//
//    public String toRejoice(){
//        setFaceExpression("Счастливое лицо");
//        return "Человек обрадовался";
//    }

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
        setFaceExpression("Доброе лицо");
        takeFood();
        return "А кто у нас такой хороший? Ути-пути, мой мохнатый пирожочек ^_^";
    }

    /**
     * Просто побранить кота, но не особо охотно, без угрожающей палки
     * @return Строка, которая описывает происшествие
     */
    public String scoldCat(){
        setFaceExpression("Недовольное лицо");
        return "Плохой кот, плохой! Так нельзя делать, бу-бу-бу!";
    }

    /**
     * Наорать на кота с угрозой применения палки
     * @return Строка, которая описывает происшествие
     */
    public String scoldCatWithWeapons(){
        setFaceExpression("Очень злое лицо");
        takeWeapons();
        return "Ах ты, варежка! Ну ты у меня сейчас получишь вот этой палукой!";
    }
}
