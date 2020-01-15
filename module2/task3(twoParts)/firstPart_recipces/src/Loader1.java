import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Loader1 {

    public static void main(String[] args) {
        int milkAmount = 1000; // ml
        int powderAmount = 1000; // g
        int eggsCount = 1000; // items
        int sugarAmount = 1000; // g
        int oilAmount = 1000; // ml
        int appleCount = 1000;
        String youCan = "You can cook ";

        boolean canCookSmth = false;

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if ((milkAmount >= 1000) && (sugarAmount >= 10) && (powderAmount >= 400) && (oilAmount >= 30)) {
            System.out.println(youCan + "Pancakes");
            canCookSmth = true;
        }

        //milk - 300 ml, powder - 5 g, eggs - 5
        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            System.out.println(youCan + "Omelette");
            canCookSmth = true;

            //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
            if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
                System.out.println(youCan + "Apple pie");
                canCookSmth = true;
            }

            if (!canCookSmth) {
                System.out.println("ничего нельзя приготовить");
            }
        }
    }
}