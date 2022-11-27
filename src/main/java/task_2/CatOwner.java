package task_2;

public class CatOwner extends Human implements Actions{
    public CatOwner(String handsObject, String faceExpression) {
        super(handsObject, faceExpression);
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
