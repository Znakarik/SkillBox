import core.*;
import core.Camera1;

import java.util.Scanner;

public class RoadController
{
    private static double passengerCarMaxWeight = 3500.0; // kg
    private static int passengerCarMaxHeight = 2000; // mm
    private static int controllerMaxHeight = 4000; // mm

    private static int passengerCarPrice = 100; // RUB
    private static int cargoCarPrice = 250; // RUB
    private static int vehicleAdditionalPrice = 200; // RUB

    public static void main(String[] args)
    {
        System.out.println("Сколько автомобилей сгенерировать?");

        Scanner scanner = new Scanner(System.in);
        int carsCount = scanner.nextInt();

        for(int i = 0; i < carsCount; i++)
        {
            Car1 car1 = Camera1.getNextCar();
            System.out.println(car1);

            //Пропускаем автомобили спецтранспорта бесплатно
            if (car1.isSpecial) {
                openWay();
                continue;
            }

            //Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
            int price = calculatePrice(car1);
            if(price == -1) {
                continue;
            }

            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }
    }

    /**
     * Расчёт стоимости проезда исходя из массы и высоты
     */
    private static int calculatePrice(Car1 car1)
    {
        int carHeight = car1.height;
        int price = 0;
        if (carHeight > controllerMaxHeight)
        {
            blockWay("высота вашего ТС превышает высоту пропускного пункта!");
            return -1;
        }
        else if (carHeight > passengerCarMaxHeight)
        {
            double weight = car1.weight;
            //Грузовой автомобиль
            if (weight > passengerCarMaxWeight)
            {
                price = passengerCarPrice;
                if (car1.hasVehicle) {
                    price = price + vehicleAdditionalPrice;
                }
            }
            //Легковой автомобиль
            else {
                price = cargoCarPrice;
            }
        }
        else {
            price = passengerCarPrice;
        }
        return price;
    }

    /**
     * Открытие шлагбаума
     */
    private static void openWay()
    {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    /**
     * Сообщение о невозможности проезда
     */
    private static void blockWay(String reason)
    {
        System.out.println("Проезд невозможен: " + reason);
    }
}