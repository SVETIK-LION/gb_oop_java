package task_2;

public class Home {
    public void startHistory(){
        CatOwner Kira = new CatOwner("Пустые руки", "Спокойное выражение лица");
        Sigizmund Sigi = new Sigizmund("Спокойное настроение");


        // Сначала дома было все тихо и спокойно
        System.out.println("Сначала дома было все спокойно:");
        System.out.printf("Выражение лица человека: %s\n", Kira.getFaceExpression());
        System.out.printf("В руках у человека: %s\n", Kira.getHandsObject());
        System.out.printf("Настроение кота: %s\n", Sigi.getMood());
        System.out.println("------------------------------------------------------");

        // Настроение кота Сигизмунда изменилось, что же он сделал?
        System.out.println("Настроение кота Сигизмунда изменилось, что же он сделал?");
        System.out.printf("Мысли кота: %s\n", Sigi.badAction());
        System.out.println("------------------------------------------------------");

        // Он подрал диван. Его хозяйка Кира недовольна и бранит кота
        System.out.println("Он подрал диван. Его хозяйка Кира недовольна и бранит кота: ");

        if (Sigi.getMood().equals("Доволен подранным диваном")){
            System.out.printf("Кира восклицает: %s\n", Kira.scoldCat());
            System.out.println("Но кот Сигизмунд не обращает внимания и продолжает драть диван");
            System.out.printf("Настроение кота: %s\n", Sigi.getMood());
            System.out.println("------------------------------------------------------");
        }

        // Кира не на шутку разозлилась >_<! Она хватает палку, кричит и угрожает Сигизмунду
        System.out.println("Кира не на шутку разозлилась >_<! Она хватает палку, кричит и угрожает Сигизмунду:");
        System.out.println(Kira.badAction());
        System.out.println("------------------------------------------------------");

        // Сигизмунд в шоке от такого обращения с ним. Он очень испугался и спрятался под диван
        System.out.println("Сигизмунд в шоке от такого обращения с ним: \n");

        if (Kira.getFaceExpression().equals("Очень злое лицо\n")){
            System.out.printf("Сигизмунд подумал: %s\n", Sigi.runAway());
        }
        System.out.println("Он очень испугался и спрятался под диван\n");
        System.out.printf("Настроение кота: %s\n", Sigi.getMood());
        System.out.println("------------------------------------------------------");

        // Кира успокоилась и решила выманить кота из-под дивана
        System.out.println("Кира успокоилась и решила выманить кота из-под дивана колбаской:\n");
        System.out.printf("Кира хвалит кота: %s\n", Kira.goodAction());
        System.out.println("------------------------------------------------------");

        // Сигизмунд тоже успокоился и вышел из-под дивана. Он начал мурлыкать, выпрашивая колбаску у Киры
        if (Kira.getFaceExpression().equals("Доброе лицо\n")){
            System.out.println("Сигизмунд тоже успокоился и вышел из-под дивана. Он замурлыкал, выпрашивая колбаску у Киры: \n");
            System.out.println(Sigi.goodAction());
        }
    }
}
