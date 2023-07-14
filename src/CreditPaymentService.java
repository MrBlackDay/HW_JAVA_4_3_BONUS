public class CreditPaymentService {
    public double calculate(double percent, int period, double amount) {

        double interestRate = percent / (100 * percent); //Расчет процентной ставки
        double monthlyPayment = amount * (interestRate / (1 - Math.pow(1 + interestRate, -period)));

        return monthlyPayment;
    }
}
