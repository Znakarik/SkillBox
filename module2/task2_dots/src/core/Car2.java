package core;

public class Car2
{

    // Обьявление переменной "+"
    public String number; // +
    public int height;// +
    public double weight;// +
    public boolean hasVehicle;// +
    public boolean isSpecial;// +

    public String toString()
    {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";// +
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}