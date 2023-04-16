public class Main {
    public static void main(String[] args) {

        int currentBalance = 100;   // Текущий балан
        int payment = 1100;         // Сумма пополнения
        int bonus;                  // Количество бонусов

        if (payment > 1000) {           // Если сумма пополнения > 1000
            bonus = payment / 100;      // То бонусы считаются так
        } else {                        // Если сумма пополнения <= 1000
            bonus = 0;                  // То бонусы считаются так
        }

        currentBalance = currentBalance + payment + bonus; // Расчет нового текущего баланса

        System.out.println("Бонусных рублей начислено: " + bonus); // Вывод бонусных рублей
        System.out.println("Текущий баланс: " + currentBalance); // Вывод нового баланса
    }
}
