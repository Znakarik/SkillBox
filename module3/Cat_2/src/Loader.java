
public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat2 = new Cat();

        cat.feed(5000.);
        System.out.println(cat.getStatus());

        // Задание 2
        System.out.println(cat.getAteFood());
        System.out.println("Вес второй кошки до - " + cat2.getWeight());
        cat2.goToPeepee();
        System.out.println("Вес второй кошки после - " + cat2.getWeight());

        //// Задание 4 - генерация кошки
        System.out.println(Cat.getCount());
        Cat cat3 = Cat.generateCatWithWeight(1000);
        System.out.println(cat3.getWeight());

        cat.setCatColors(CatColors.DARK_BLUE);

        cat2.setCatColors(CatColors.GREEN);
        System.out.println("Второй коть - " + cat2.getCatColors());
        System.out.println("Первый коть - " + cat.getCatColors());

        // Создание копии кошки
        Cat cat4 = Cat.makeCopyCat(cat2);
        System.out.println("Цвет нашей скопированной кошки должен быть одинаков с второй кошкой - "
                + cat4.getCatColors());

        // Задание 1
//        for (int i = 0; i < cat.getWeight(); i++) {
//            cat2.meow();
//        }
//        System.out.println(cat2.getStatus());
    }

}
