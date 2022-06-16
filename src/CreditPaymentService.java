
    public class CreditPaymentService {
        public double calculate(int amount, int time) {
            double percent = 9.9;
            double rate = 1 + ((percent + 1) * (time - 1));
            double payment = amount / rate;
            return payment;
        }
    }

