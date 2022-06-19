

public class CreditPaymentService {
    public double calculate(int amount, int time) {

        double percent = 9.99 / (time * 100);                         // Ставка по кредиту в месяц
        double result = percent + 1;                                  // Ставка по кредиту в месяц + 1
        float part = (float) Math.pow(result, time);                  // Возведение в степень
        double rate1 = percent * part;
        double rate2 = part - 1;
        double rate = rate1 / rate2;                                  // коэффициент аннуитета
        double payment = amount * rate;                               // ежемесячный платеж
        return payment;
    }
}

