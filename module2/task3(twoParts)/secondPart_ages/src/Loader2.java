import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Loader2 {
    public static void main(String[] args) {
        // Проверяем Мишу
        // Перепробовала уже 10 раз как можно решить задачу
        // Подскажите, пожалуйста, в какую сторону лучше смотреть?
        // Алгоритмы поиска? Вот с алгоритмами пробелема. Буду благодарна за доп. задание

        int vasya = 25;
        int katya = 22;
        int misha = 25;

        //First decision
        // ===============================================================

//        int minimum = Integer.min(misha,Integer.min(vasya,katya));
//        int middle = misha >= katya && misha <= vasya ? misha : katya >= misha && katya <= vasya ? katya :  vasya;
//        int maximum = Integer.max(misha,Integer.max(katya,vasya));
//
        //Second decision
        // ===============================================================
        List<Integer> humanList = new LinkedList<>();
        humanList.add(vasya);
        humanList.add(katya);
        humanList.add(misha);

        Collections.sort(humanList);

        int minimum = humanList.get(0);
        int middle = humanList.get(1);
        int maximum = humanList.get(2);

        // ===============================================================

        System.out.printf("Самый большой возраст: %s\n",maximum);
        System.out.printf("Средний возраст: %s\n",middle);
        System.out.printf("Меньший возраст: %s\n",minimum);
    }
}

