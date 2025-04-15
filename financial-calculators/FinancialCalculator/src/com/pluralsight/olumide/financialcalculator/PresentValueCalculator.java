package com.pluralsight.olumide.financialcalculator;

import java.security.PublicKey;
import java.util.Scanner;

public class PresentValueCalculator {
    public static double getMonthlyPayout(Scanner scanner){
        System.out.println("What is your monthly payout: ");
        return scanner.nextDouble();
    }
    public  static double getInterestRate(Scanner scanner){
        System.out.println("What is your interest rate ");
    }

    public static void main(String[] args) {
        //Initialize scanner
        Scanner scanner = new Scanner(System.in);

        //User inputs
        double monthlyPayout = getMonthlyPayout(scanner);
    }
}
