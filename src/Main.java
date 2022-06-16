public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        // int amount = 1_000_000;
        // int time = 12;
        // double payment = service.calculate(amount, time);

        // System.out.println(payment);

        System.out.println();
        System.out.println("Сумма 1_000_000 рублей/ Срок 12 месяцев");
        System.out.println(service.calculate( 1_000_000, 12 ));

        System.out.println();
        System.out.println("Сумма 1_000_000 рублей/ Срок 24 месяца");
        System.out.println(service.calculate( 1_000_000, 24 ));

        System.out.println();
        System.out.println("Сумма 1_000_000 рублей/ Срок 36 месяцев");
        System.out.println(service.calculate( 1_000_000, 36 ));
    }
}
