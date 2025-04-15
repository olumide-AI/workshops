package com.pluralsight.olumide.financialcalculator;

import java.util.Scanner;

public class FutureValueCalculator {
    // Get data from user
    //Get Initial Deposit
    public static double getInitialDeposit(Scanner scanner){
        System.out.println("how much would you like to deposit: Ex(20000)");
        return scanner.nextDouble();
    }
    //Get Interest Rate
    public static double getAnnualInterestRate(Scanner scanner){
        System.out.println("Enter your annual interest rate as a decimal (e.g., 0.045 for 4.5%): ");
        return scanner.nextDouble();
    }
    //Get Number of Years
    public static int getNumOfYears(Scanner scanner){
        System.out.println("How many years will the deposit mature for?");
        return scanner.nextInt();
    }

    // Future Value Calc and Total Interest Calc
    //Future Value Calc
    public static double getFutureValueCalc(double principal, double annualInterestRate, int numOfYears){
        double firstPart = (1 + (annualInterestRate/365));
        double secondPart = 365 * numOfYears;
        return principal * Math.pow(firstPart,secondPart);
    }
    //Total interest calculations
    public static double getTotalInterest(double futureValue, double principal){
        return futureValue - principal;
    }

    //Displaying Output to User
    public static void disUserResult(double futureValue, double principal, int numOfYears, double annualInterestRate, double totalInterest ){
        System.out.println("Your Future value calculator is: ");
        //System.out.println("If you deposit $" + principal + "in a CD that earns " + annualInterestRate + " interest and matures in " + numOfYears + "years, your CD's ending balance will be $" + futureValue + "and you would have earned $" + totalInterest + " in interest.");
        System.out.printf("If you deposit $%,.2f in a CD that earns %.2f%% interest and matures in %d years,%n" + "your CD's ending balance will be $%,.2f and you would have earned $%,.2f in interest.%n", principal, annualInterestRate * 100, numOfYears, futureValue, totalInterest);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //User Input
        double initialDeposit = getInitialDeposit(scanner);
        double annualInterestRate = getAnnualInterestRate(scanner);
        int numOfYears = getNumOfYears(scanner);

        //Calculations and Logic
        double futureValueCalc = getFutureValueCalc(initialDeposit, annualInterestRate, numOfYears);
        double totalInterest = getTotalInterest(futureValueCalc, initialDeposit);

        //Displaying output to user
        disUserResult(futureValueCalc, initialDeposit, numOfYears, annualInterestRate, totalInterest);

        scanner.close();
    }
}
