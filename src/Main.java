public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthlyPayment12 = service.calculate(12);
        System.out.println("Ежемесячный платёж по кредиту на 12 месяцев составит: " + monthlyPayment12 + " рублей");
        double monthlyPayment24 = service.calculate(24);
        System.out.println("Ежемесячный платёж по кредиту на 24 месяцев составит: " + monthlyPayment24 + " рублей");
        double monthlyPayment36 = service.calculate(36);
        System.out.println("Ежемесячный платёж по кредиту на 36 месяцев составит: " + monthlyPayment36 + " рублей");
    }
}
