package task_2;


/**
 * Общий абстрактный класс для всех людей, вне зависимости от наличия у них кота
 */
public abstract class Human {
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

}
