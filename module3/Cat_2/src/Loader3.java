
public class Loader3 {
    public static void main(String[] args) {
//        Cat2 cat = new Cat2();
//        Cat2 cat2 = new Cat2();
//
////        ==========
//
//        Cat2 cat22 = new Cat2(0);
//
//        for (int i = 0; i < cat22.getWeight(); i++) {
//            cat22.meow();
//        }
//        System.out.println(cat22.getStatus()); // Playing
//
////        ==========
//
//        cat.feed(5000.);
//        System.out.println(cat.getStatus());
//
        // Задание 2
        Cat2 cat2 = new Cat2();
        Cat2 cat = new Cat2();
//        System.out.println(cat.getAteFood());
        System.out.println("Вес второй кошки до - " + cat2.getWeight());
        cat2.goToPeepee();
        cat2.feed(100.);
        System.out.println("Было сьедено второй кошкой - " + cat2.getAteFood());
        System.out.println("Вес второй кошки после - " + cat2.getWeight());

//
//        //// Задание 4 - генерация кошки
//        System.out.println(Cat2.getCount());
//        Cat2 cat23 = Cat2.generateCatWithWeight(1000);
//        System.out.println(cat23.getWeight());
//
//        cat.setCatColors(CatColors.DARK_BLUE);
//
//        cat2.setCatColors(CatColors.GREEN);
//        System.out.println("Второй коть - " + cat2.getCatColors());
//        System.out.println("Первый коть - " + cat.getCatColors());
//
//        // Создание копии кошки
//        Cat2 cat24 = Cat2.makeCopyCat(cat2);
//        System.out.println("Цвет нашей скопированной кошки должен быть одинаков с второй кошкой - "
//                + cat24.getCatColors());

        // Задание 1
//        for (int i = 0; i < cat.getWeight(); i++) {
//            cat2.meow();
//        }
//        System.out.println(cat2.getStatus());

//        Cat2 c = new Cat2();
//        System.out.println(c.getWeight());
//        c.meow();
//        System.out.println(c.getWeight());
//        System.out.println(c.getAteFood());


////       TASK 1 Модификации 16.01.2019
//        Cat2 cat2 = new Cat2();
//
//        int tpm = 0;
//        System.out.println(cat2.getWeight());
//        for (int i = 0; i < cat2.getWeight()+1; i++) {
//            cat2.feed(10000.);
//            System.out.println(cat2.getStatus());
//            tpm++;
//            System.out.println(i);
//        }
////        System.out.println(cat2.getStatus());
//        System.out.println(tpm);
//        System.out.println("\n============\n");
//        System.out.println(cat2.getStatus());
//    }

    }
}
