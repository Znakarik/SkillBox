public class Refrigerator {
    private int milkAmount; // ml
    private int powderAmount; // g
    private int eggsCount; // items
    private int sugarAmount; // g
    private int oilAmount; // ml
    private int appleCount ;

    public Refrigerator(){
        milkAmount =(int) Math.round(Math.random() * 300);
        powderAmount =(int) Math.round(Math.random() * 1000);
        eggsCount =(int) Math.round(Math.random() * 20);
        sugarAmount =(int) Math.round(Math.random() * 400);
        oilAmount =(int) Math.round(Math.random() * 200);
        appleCount =(int) Math.round(Math.random() * 20);
    }

    public int getMilkAmount() {
        return milkAmount;
    }

    public int getPowderAmount() {
        return powderAmount;
    }

    public int getEggsCount() {
        return eggsCount;
    }

    public int getSugarAmount() {
        return sugarAmount;
    }

    public int getOilAmount() {
        return oilAmount;
    }

    public int getAppleCount() {
        return appleCount;
    }
}
