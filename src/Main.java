// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double amountCredit = 1_000_000; //сумма кредита
        double percent = 9.99; //процентная ставка

        //1. Расчёт суммы ежемесячного платежа при сроке кредита - 12 месяцев
        int periodOneYear = 12; //срок кредита в месяцах
        CreditPaymentService monthlyPayment = new CreditPaymentService(); //вызов метода расчёта суммы кредита
        double amountOne = monthlyPayment.calculate(percent, periodOneYear, amountCredit);
        System.out.println("Сумма ежемесячного платежа при сроке кредита: " + periodOneYear + " месяцев");
        System.out.println(amountOne); //Вывод расчётов
        System.out.println(" ");

        //2. Расчёт суммы ежемесячного платежа при сроке кредита - 24 месяцев
        int periodTwoYears = 24; //срок кредита в месяцах
        CreditPaymentService monthlyPaymentTwo = new CreditPaymentService(); //вызов метода расчёта суммы кредита
        double amountTwo = monthlyPaymentTwo.calculate(percent, periodTwoYears, amountCredit);
        System.out.println("Сумма ежемесячного платежа при сроке кредита: " + periodTwoYears + " месяца");
        System.out.println(amountTwo); //Вывод расчётов
        System.out.println(" ");

        //3. Расчёт суммы ежемесячного платежа при сроке кредита - 36 месяцев
        int periodThreeYears = 36; //срок кредита в месяцах
        CreditPaymentService monthlyPaymentThree = new CreditPaymentService(); //вызов метода расчёта суммы кредита
        double amountThree = monthlyPaymentTwo.calculate(percent, periodThreeYears, amountCredit);
        System.out.println("Сумма ежемесячного платежа при сроке кредита: " + periodThreeYears + " месяцев");
        System.out.println(amountThree); //Вывод расчётов

    }
}