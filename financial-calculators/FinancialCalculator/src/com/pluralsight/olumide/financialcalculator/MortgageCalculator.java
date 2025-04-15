package com.pluralsight.olumide.financialcalculator;

import java.util.Scanner;

public class MortgageCalculator {
    //Create scanner class for user input for readability
    static Scanner scanner = new Scanner(System.in);
    static double annualIntRate = 0.07625;

    //Get principal, interest rate and loan length from user
    //Get Principal
    public static double getPrincipalAmount() {
        System.out.println("Please provide your Principal amount. Ex(120000): ");
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
    // Number of monthly payments
    public static double getNoMonthlyPay(){
        double noMonthlyPay = 12 * getLoanTerm();
        return noMonthlyPay;
    }
    // Compound interest formula calculator for the monthly payment
    public static double getMonthlyPay(){
        double monthlyPay =  (getMonthlyIntRate()*(Math.pow(1+getMonthlyIntRate(),getNoMonthlyPay())) / (Math.pow(1+getMonthlyIntRate(),getNoMonthlyPay()))-1);
        return monthlyPay;
    }
    //Total interest calculations
    public static double getTotalInt(){
        double totalInt = (getMonthlyPay() * getNoMonthlyPay()) - getPrincipalAmount();
        return totalInt;
    }


    //Display Output
    public static void disUserCalculations(){
        System.out.println();
    }

}
