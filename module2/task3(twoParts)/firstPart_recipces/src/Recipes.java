import java.util.ArrayList;

public class Recipes {
    private int milkAmount; // ml
    private int powderAmount; // g
    private int eggsCount; // items
    private int sugarAmount; // g
    private int oilAmount; // ml
    private int appleCount;

    public Recipes() {

    }

    public Recipes(int milkAmount, int powderAmount, int eggsCount, int sugarAmount, int oilAmount, int appleCount) {
        this.milkAmount = milkAmount;
        this.powderAmount = powderAmount;
        this.eggsCount = eggsCount;
        this.sugarAmount = sugarAmount;
        this.oilAmount = oilAmount;
        this.appleCount = appleCount;
    }


    public void setMilkAmount(int milkAmount) {
        this.milkAmount = milkAmount;
    }

    public void setPowderAmount(int powderAmount) {
        this.powderAmount = powderAmount;
    }

    public void setEggsCount(int eggsCount) {
        this.eggsCount = eggsCount;
    }

    public void setSugarAmount(int sugarAmount) {
        this.sugarAmount = sugarAmount;
    }

    public void setOilAmount(int oilAmount) {
        this.oilAmount = oilAmount;
    }

    public void setAppleCount(int appleCount) {
        this.appleCount = appleCount;
    }

    ArrayList<Recipes> recipes = new ArrayList<>();

}
