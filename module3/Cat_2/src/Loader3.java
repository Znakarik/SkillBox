
public class Loader3 {
    public static void main(String[] args) {
        Cat2 cat = new Cat2();
        Cat2 cat2 = new Cat2();

        /*
        Насчет Вашего комментария к заданию.
        У нас же есть только конструктор без параметров,
        Вы пытаетесь создать кота с параметром "0"
        Создание невозможно, только если добавить новый конструктор с параметром int
        Возможно я неправильно что-то поняла

        Cat cat = new Cat(0);
        Cat cat2 = new Cat();
        for (int i = 0; i < cat.getWeight(); i++) {
            cat2.meow();
        }
        System.out.println(cat2.getStatus()); // Playing
         */

        cat.feed(5000.);
        System.out.println(cat.getStatus());

        // Задание 2
        System.out.println(cat.getAteFood());
        System.out.println("Вес второй кошки до - " + cat2.getWeight());
        cat2.goToPeepee();
        System.out.println("Вес второй кошки после - " + cat2.getWeight());

        //// Задание 4 - генерация кошки
        System.out.println(Cat2.getCount());
        Cat2 cat23 = Cat2.generateCatWithWeight(1000);
        System.out.println(cat23.getWeight());

        cat.setCatColors(CatColors.DARK_BLUE);

        cat2.setCatColors(CatColors.GREEN);
        System.out.println("Второй коть - " + cat2.getCatColors());
        System.out.println("Первый коть - " + cat.getCatColors());

        // Создание копии кошки
        Cat2 cat24 = Cat2.makeCopyCat(cat2);
        System.out.println("Цвет нашей скопированной кошки должен быть одинаков с второй кошкой - "
                + cat24.getCatColors());

        // Задание 1
//        for (int i = 0; i < cat.getWeight(); i++) {
//            cat2.meow();
//        }
//        System.out.println(cat2.getStatus());
    }

}
