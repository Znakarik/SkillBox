import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Loader {

    public static void main(String[] args) {
        int milkAmount = 1000; // ml
        int powderAmount = 1000; // g
        int eggsCount = 1000; // items
        int sugarAmount = 1000; // g
        int oilAmount = 1000; // ml
        int appleCount = 1000;
        String youCan = "You can cook ";

        /**
         Пыталась реализовать проверку составляющих одного обьекта
         на составляющие другого обьекта.
         Подскажите, пожалуйста, какой/какими коллекциями
         Это лучше всего сделать? Может обьекты должны лежать
         в HashMap и проверяться по строкам/ключам?
         *
          */
//        Refrigerator case1 = new Refrigerator();
//        Recipes pancakes = new Recipes();
//        pancakes.setPowderAmount(400);
//        pancakes.setSugarAmount(10);
//        pancakes.setMilkAmount(1000);
//        pancakes.setOilAmount(30);
//

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if ((milkAmount >= 1) && (sugarAmount >= 10) && (powderAmount >= 400) && (oilAmount >= 30)) {
            System.out.println(youCan + "Pancakes");
        }

        //milk - 300 ml, powder - 5 g, eggs - 5
         else if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            System.out.println(youCan + "Omelette");
        }

        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
         else if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
            System.out.println(youCan + "Apple pie");
        } else System.out.println("Иди в магазин");
    }
}