import java.util.Scanner;

public class Main
{
    /**
     *  Калькулятор для расчета "рентабельно ли нас (инвестор/инвесторы)
     *  вкладывать деньги в этот проект
     *
     *  Было бы здорово иметь что-то подобное, что работало бы с БД
     *  Берет выдуманные средние показатели одного района на аренду/покупку расходников и тд
     *  Вычисляет чистую прибыль/зп менеджеров и актуальность проекта/компании
     *
     */
    private static int minIncome = 200000;
    private static int maxIncome = 900000;

    private static int officeRentCharge = 140000;
    private static int telephonyCharge = 12000;
    private static int internetAccessCharge = 7200;

    private static int assistantSalary = 45000;
    private static int financeManagerSalary = 90000;

    private static double mainTaxPercent = 0.24;
    private static double managerPercent = 0.15;

    private static double minInvestmentsAmount = 100000;

    public static void main(String[] args)
    {

        /** Доход от 500917 позволяет инвистировать.
         *  Зарплата менеджера: 75137.55 = 15% от income
            Общая сумма налогов: 31579.068000000003 = 6,3% от income
         *  Компания может инвестировать: да
         *
         *  Пока на ум ничего не приходит в голову насчет задания с здездочкой.
         *  Нашла пока только минималку перебором
         */


        // Бесконечный цикл постоянно слушает информацию с клавиатуры
        while(true)
        {
            System.out.println("Введите сумму доходов компании за месяц " +
                "(от 200 до 900 тысяч рублей): ");
            int income = (new Scanner(System.in)).nextInt();

            if(!checkIncomeRange(income)) {
                continue;
            } // Если не посередке границ, то возращаемся к началу цикла

            double managerSalary = income * managerPercent;
            double pureIncome = income - managerSalary -
                calculateFixedCharges();
            double taxAmount = mainTaxPercent * pureIncome; // чистый доход * основной налог = сумма налога
            double pureIncomeAfterTax = pureIncome - taxAmount; // чистый доход после уплаты

            boolean canMakeInvestments = pureIncomeAfterTax >=
                minInvestmentsAmount; // могут проинвестировать если = чистый доход
            // после всех уплат больше минимальной суммы инвестиций (если бизнес не погибает)

            System.out.println("Зарплата менеджера: " + managerSalary); //зарплата менеджера
            System.out.println("Общая сумма налогов: " +
                (taxAmount > 0 ? taxAmount : 0)); // сколько платят налогов
            System.out.println("Компания может инвестировать: " + // может ли компания ага
                (canMakeInvestments ? "да" : "нет"));
            if(pureIncome < 0) { // чистый доход
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
            }
        }
    }

    private static boolean checkIncomeRange(int income)
    {
        if(income < minIncome)
        {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if(income > maxIncome)
        {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
    }

    private static int calculateFixedCharges()
    {
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;
    }
}
