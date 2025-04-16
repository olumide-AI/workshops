package com.pluralsight.olumide.financialcalculator;

import java.util.Scanner;

public class MortgageCalculator {
    //Get principal, interest rate and loan length information from user
    //Get Principal
    public static double getPrincipalAmount(Scanner scanner) {
        System.out.println("Please provide your Principal amount. Ex(120000): ");
        return scanner.nextDouble();
    }
    //Get Annual Interest rate
    public static double getAnnualIntRate(Scanner scanner) {
        System.out.print("Enter your annual interest rate as a decimal (e.g., 0.07625 for 7.625%): ");
        return scanner.nextDouble();
    }
    //Length of loan
    public static int getLoanTerm(Scanner scanner){
        System.out.println("What is your loan term in years (Ex 12 for 12 years): ");
        return scanner.nextInt();
    }

    //Logic calculations
    //Convert Annual Rate to Monthly rate
    public static double getMonthlyIntRate(double annualRate){
        return annualRate/12/100;
    }
    //Calculate the Monthly payments using compound interest formula
    public static double calculateMonthlyPay(double principal, double monthlyIntRate, int noMonthlyPay){
        return principal * (monthlyIntRate * Math.pow((1+monthlyIntRate),noMonthlyPay)/ (Math.pow((1+monthlyIntRate),noMonthlyPay)-1));
    }
    //Calculate the total interest rate using the formula from workshop example
    public static double calculateTotalInt(double principal, double monthlyPay, int noMonthlyPay){
        return (monthlyPay * noMonthlyPay) - principal;
    }

    //Display the user results based on data given
    //we need monthly payments, prinipal and total interest displayed
    public static void disUserResults(double principal, double annualRate, int loanTerm, double monthlyPay, double totalInt){
        System.out.println("Your Mortgage calculator info is: ");
        //System.out.println("Your $" + principal + " loan at " + annualRate + " for " + loanTerm + " years would have a " + monthlyPay  + "/mo payment with a total interest of $" + totalInt);
        System.out.printf("Your $%,.2f loan at %.3f%% interest for %d years would have a $%,.2f/mo payment with a total interest of $%,.2f%n", principal, annualRate * 100, loanTerm, monthlyPay, totalInt);


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //scanner initalizers
        double principal = getPrincipalAmount(scanner);
        int loanTerm = getLoanTerm(scanner);
        double annualRate = getAnnualIntRate(scanner); //so we can reuse annual rate and we don't have to ask user anymore

        // interest rate calc and number of monthly payments
        double monthlyIntRate = getMonthlyIntRate(annualRate);
        int noMonthlyPay = loanTerm * 12;

        //Big calculations on total interest and monthly payment
        double monthlyPay = calculateMonthlyPay(principal,monthlyIntRate,noMonthlyPay);
        double totalInt = calculateTotalInt(principal, monthlyPay, noMonthlyPay);

        //Display result
        disUserResults(principal, annualRate, loanTerm, monthlyPay, totalInt);

        scanner.close();

    }


}
