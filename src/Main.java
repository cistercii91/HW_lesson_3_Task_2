// Объявляете переменные для входных данных и
// параметров программы: начального счёта,
// суммы пополнения и тп

// Условным оператором проверяете, превысила ли
// сумма пополнения порог, и для этих двух разных
// сценариев рассчитываете сумму бонуса и выводите
// на экран.

public class Main {
    public static void main(String[] args) {
        int userMoney = 300;
        int replenishment = 2300;
        int numberBonus = 0;
        if (replenishment>=1000) {
            numberBonus = replenishment / 100;
        }
        int newSum = userMoney + replenishment + numberBonus;

        System.out.println("Итоговый счет " + newSum);
        System.out.println("Число бонусов " + numberBonus);
    }
}