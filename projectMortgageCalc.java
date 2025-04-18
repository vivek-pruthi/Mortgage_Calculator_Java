import java.text.NumberFormat;
import java.util.Scanner;

public class projectMortgageCalc {
    public static void main(String[] args) {
        final byte Month_In_Years = 12;
        final byte Percent = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate / Percent / Month_In_Years;

        System.out.print("Period(Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * Month_In_Years;


        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) /
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + result);
    }
}
