package task_2;


/**
 * класс владельца кота (наследуется от абстрактного класса человека - Human)
 */
public class CatOwner extends Human implements Actions{
    public CatOwner(String handsObject, String faceExpression) {
        super(handsObject, faceExpression);
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

    @Override
    public String badAction() {
        setFaceExpression("Очень злое лицо\n");
        takeWeapons();
        return "Ах ты, варежка! Ну ты у меня сейчас получишь вот этой палкой!";
    }


    /**
     * Похвалить кота и дать колбаску
     * @return Строка, которая описывает происшествие
     */

    @Override
    public String goodAction() {
        setFaceExpression("Доброе лицо\n");
        takeFood();
        return "А кто у нас такой хороший котик? Ути-пути, мой мохнатый пирожочек ^_^";
    }
}
