
public class Cat
{
    // Задание 4
    public static final int EYE_COUNT = 4;
    private static final double MIN_WEIGHT = 1000.0;
    private static final int MAX_WEIGHT = 5000;
    private CatColors catColor;
    // Задание 3
    private static int count;
    private double originWeight;
    private double weight;

    public CatColors setCatColors(CatColors color){
        this.catColor = color;
        return color;
    }

    public CatColors getCatColors(){
        return this.catColor;
    }
    public static Cat makeCopyCat(Cat cat){
        Cat cat1 = cat;
        return cat1;
    }


    // Задание 3
    public static int getCount(){
        return count;
    }
    // Задание 2 - go to peepee
    public void goToPeepee(){
        weight -= 1;
        System.out.println("Please, be careful");
    }

    // Задание 2 -  Масса сьеденной еды
    public double getAteFood(){
        return weight - originWeight;
    }
    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        Cat.count++;

    }
    public static Cat generateCatWithWeight(int weight){
        return new Cat(weight);
    }
    // Задание 4 - конструктор
    public Cat(int weight){
        this.weight = weight;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            Cat.count -= 1;
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            Cat.count -= 1;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}