
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
//        // Задание 2
//        System.out.println(cat.getAteFood());
//        System.out.println("Вес второй кошки до - " + cat2.getWeight());
//        cat2.goToPeepee();
//        System.out.println("Вес второй кошки после - " + cat2.getWeight());
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

        Cat2 cat2 = new Cat2();

        System.out.println(cat2.getWeight());
        for (int i = 0; i < cat2.getWeight(); i++) {
            cat2.feed(100000.);
            System.out.println(cat2.getStatus());
        }

    }

}
