public class CreditPaymentService {
    public double calculate(int creditTerm) {
        int amountCredit = 1_000_000;
        double annualInterest = 9.99;
        double monthlyInterest = annualInterest / (100 * 12);
        double monthlyPayment = amountCredit * monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -creditTerm));
        return monthlyPayment;
    }
}
