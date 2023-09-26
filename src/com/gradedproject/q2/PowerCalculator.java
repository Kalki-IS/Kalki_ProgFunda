package com.gradedproject.q2;
import java.util.Scanner;
public class PowerCalculator {
    public static double calculatePower(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1 / (x * calculatePower(x, -n - 1));
        } else {
            return x * calculatePower(x, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number X: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the power N: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Negative exponent is not supported for this program.");
        } else {
            double result = calculatePower(x, n);
            System.out.println("X power N is: " + result);
        }

    }
}
