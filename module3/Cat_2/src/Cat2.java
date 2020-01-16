
public class Cat2 {
    // Задание 4
    public static final int EYE_COUNT = 4;
    private static final double MIN_WEIGHT = 1000.0;
    private static final int MAX_WEIGHT = 5000;
    private CatColors catColor;
    // Задание 3
    private static int count;
    private double originWeight;
    private boolean isAlive;
    private double weight;

    public void setCatColors(CatColors color) {
        this.catColor = color;
    }

    public CatColors getCatColors() {
        return this.catColor;
    }

    //    Добавляю переменные по второму заданию для каждой модификации веса
    private double ateFood;
    private int goesPeePee;
    private int moewn;
    private double drinked;

    private double totalWeight;

    public static Cat2 makeCopyCat(Cat2 cat2) {
        Cat2 cat21 = cat2;
        return cat21;
    }

    // Задание 3
    public static int getCount() {
        return count;
    }

    // Задание 2 - go to peepee
    public void goToPeepee() {
        if (isAlive) {
//            weight -= 1;
            goesPeePee = +1;
            System.out.println(" I'm pissing!)\nPlease, be careful! =)");
        } else System.err.println("Мертвые не писают!");
    }

    // Задание 2 -  Масса сьеденной еды
    public double getAteFood() {
        return ateFood;
    }

    public Cat2() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        Cat2.count++;
        isAlive = true;

    }

    public static Cat2 generateCatWithWeight(int weight) {
        return new Cat2(weight);
    }

    // Задание 4 - конструктор
    public Cat2(int weight) {
        this.weight = weight;
    }

    public void meow() {
        if (isAlive) {
            moewn += 1;
            System.out.println("Meow");
        } else System.err.println("Мертвые не мявкают!");
    }

    public void feed(Double amount) {
        if (isAlive) {
            ateFood = +amount;
        } else System.err.println("Мертвые коты не умеют жрать");
    }

    public void drink(Double amount) {
        if (isAlive) {
            drinked = +amount;
        }
        System.err.println("Мертвые не потеют!");
    }

    public Double getWeight() {
        totalWeight = originWeight + getAteFood() - goesPeePee - moewn + drinked;
        return totalWeight;
    }

    public String getAlive() {
        if (weight < MIN_WEIGHT) {
            Cat2.count -= 1;
            isAlive = false;
            return "Dead";
        } else if (weight > MAX_WEIGHT) {
            isAlive = false;
            Cat2.count -= 1;
            return "Exploded";
        } else if (weight > originWeight) {
            isAlive = true;
            return "Sleeping";
        } else {
            isAlive = true;
            return "Playing";
        }

    }
}