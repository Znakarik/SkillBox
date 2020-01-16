import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Loader2 {
    public static void main(String[] args) {

        int vasya = 25;
        int katya = 22;
        int misha = 25;

        max(vasya, katya, misha);
    }

    public static void max(int a, int b, int c) {
        int maximum = 0;
        int middle = 0;
        int minimum = 0;
        if (a >= b) {
            maximum = a;
            if (b >= c) {
                middle = b;
                minimum = c;
            } else if (c >= b) {
                middle = c;
                minimum = b;
            }
        }

        /*
        Вроде как вышло :) Посмеялась, спасибо)
        А такой способ похож на настоящее применимое решение?
        Что-то ну очень коряво выглядит))
         */

        if(c >= b){
            maximum = c;
            if(b >= a){
                middle = b;
                minimum = a;
            }else if(a >= b){
                middle = a;
                minimum = b;
            }
        }

//      ====================

        if (b >= a) {
            maximum = b;
            if (a >= c) {
                middle = a;
                minimum = c;
            } else if (c >= a) {
                middle = c;
                minimum = a;
            }
        }

//        ====================

        if (c >= a) {
            maximum = c;
            if (a >= b) {
                middle = a;
                minimum = b;
            } else if (b >= a) {
                middle = b;
                minimum = a;
            }
        }
        System.out.printf("Самый большой возраст: %s\n", maximum);
        System.out.printf("Средний возраст: %s\n", middle);
        System.out.printf("Меньший возраст: %s\n", minimum);
    }
}

