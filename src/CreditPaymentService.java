public class CreditPaymentService {
    public double calculate(double percent, int period, double amount) {

        double monthlyPayment = amount * ((percent / (100 * 12)) / (1 - Math.pow(1 + (percent / (100 * 12)), -period))); //формула расчета аннуитетного ежемесячного платежа

        return monthlyPayment;
    }
}
