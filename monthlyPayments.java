package test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Im {

    static Scanner userinput = new Scanner(System.in);

    static double computePayment(double loanAmt, double rate, int years) {
        double r = (rate / 100.0) / 12.0;
        int n = years * 12;

        double numerator = r * Math.pow(1 + r, n);
        double denominator = Math.pow(1 + r, n) - 1;

        return loanAmt * (numerator / denominator);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Monthly Mortgage Calculator");

        System.out.print("\nEnter principal: ");
        double a = userinput.nextDouble();

        System.out.print("Enter yearly interest rate (no % sign): ");
        double b = userinput.nextDouble();

        System.out.print("Enter number of years: ");
        int c = userinput.nextInt();

        double payment = computePayment(a, b, c);

        System.out.printf("\nThe monthly payment is %.2f\n", payment);
    }
}
