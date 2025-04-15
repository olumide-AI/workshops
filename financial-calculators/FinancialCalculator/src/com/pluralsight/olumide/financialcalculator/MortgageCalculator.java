package com.pluralsight.olumide.financialcalculator;

import java.util.Scanner;

public class MortgageCalculator {
    //Create scanner class for user input for readability
    static Scanner scanner = new Scanner(System.in);
    static double annualIntRate = 0.07625;

    //Get principal, interest rate and loan length from user
    //Get Principal
    public static double getPrincipalAmount() {
        System.out.println("Please provide your Principal amount: ");
        double principal = scanner.nextDouble();
        return principal;
    }
    //Interest rate is predefined
    public static double getMonthlyIntRate() {
        double monthlyIntRate = annualIntRate/12;
        System.out.println("Your monthly interest rate: " + monthlyIntRate);
        return monthlyIntRate;
    }
    //Length of loan
    public static int getLoanTerm(){
        System.out.println("What is your loan term: ");
        int loanTerm = scanner.nextInt();
        return loanTerm;
    }

    //Logic calculations 

}
