

public class CreditPaymentService {

    public double calculate(int amount, int time) {
        double result = 1;
        double percent = 9.9 / time * 100;                   // Ставка по кредиту в месяц
        result = percent;                                          //        Цикл
        for (int i = 1; i <= time; i++) {                    // возведение в степень
            result = result * percent;                       //      12, 24, 36
        }
            double rate = percent * result / result - 1;     // коэффициент аннуитета
            double payment = amount * rate;                  // ежемесячный платеж

            return payment;
        }
    }

