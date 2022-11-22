package task_2;

public class Home {
    public static void main(String[] args) {
        Human Kira = new Human("Пустые руки", "Спокойное выражение лица");
        Cat Sigizmund = new Cat("Спокойное настроение");

        // Сначала дома было все тихо и спокойно
        System.out.println("Сначала дома было все спокойно:");
        System.out.printf("Выражение лица человека: %s\n", Kira.getFaceExpression());
        System.out.printf("В руках у человека: %s\n", Kira.getHandsObject());
        System.out.printf("Настроение кота: %s\n", Sigizmund.getMood());
        System.out.println("------------------------------------------------------");

        // Настроение кота Сигизмунда изменилось, что же он сделал?
        System.out.println("Настроение кота Сигизмунда изменилось, что же он сделал?");
        System.out.println(Sigizmund.sharpenClawsOnSofa());
        System.out.println("------------------------------------------------------");

        // Он подрал диван. Его хозяйка Кира недовольна и бранит кота
        System.out.println("Он подрал диван. Его хозяйка Кира недовольна и бранит кота: ");

        if (Sigizmund.getMood().equals("Доволен подранным диваном")){
            System.out.printf("Кира восклицает: %s\n", Kira.scoldCat());
            System.out.println("Но кот Сигизмунд не обращает внимания и продолжает драть диван");
            System.out.printf("Настроение кота: %s\n", Sigizmund.getMood());
            System.out.println("------------------------------------------------------");
        }

        // Кира не на шутку разозлилась >_<! Она хватает палку, кричит и угрожает Сигизмунду
        System.out.println("Кира не на шутку разозлилась >_<! Она хватает палку, кричит и угрожает Сигизмунду:");
        System.out.println(Kira.scoldCatWithWeapons());
        System.out.println("------------------------------------------------------");

        // Сигизмунд в шоке от такого обращения с ним. Он очень испугался и спрятался под диван
        System.out.println("Сигизмунд в шоке от такого обращения с ним: \n");

        if (Kira.getFaceExpression().equals("Очень злое лицо\n")){
            System.out.printf("Сигизмунд подумал: %s\n", Sigizmund.runAway());
        }
        System.out.println("Он очень испугался и спрятался под диван\n");
        System.out.printf("Настроение кота: %s\n", Sigizmund.getMood());
        System.out.println("------------------------------------------------------");

        // Кира успокоилась и решила выманить кота из-под дивана
        System.out.println("Кира успокоилась и решила выманить кота из-под дивана колбаской:\n");
        System.out.printf("Кира хвалит кота: %s\n", Kira.praiseCat());
        System.out.println("------------------------------------------------------");

        // Сигизмунд тоже успокоился и вышел из-под дивана. Он начал мурлыкать, выпрашивая колбаску у Киры
        if (Kira.getFaceExpression().equals("Доброе лицо\n")){
            System.out.println("Сигизмунд тоже успокоился и вышел из-под дивана. Он замурлыкал, выпрашивая колбаску у Киры: \n");
            System.out.println(Sigizmund.begSausage());
        }
    }
}
