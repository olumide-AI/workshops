package com.pluralsight.olumide.financialcalculator;

import java.security.PublicKey;
import java.util.Scanner;

public class PresentValueCalculator {
    //Ask user for their monthly pay out
    public static double getMonthlyPayout(Scanner scanner){
        System.out.println("What is your monthly payout Ex(120000): ");
        return scanner.nextDouble();
    }
    //Ask user for their expected interest rate pay out
    public  static double getInterestRate(Scanner scanner){
        System.out.println("What is your expected interest rate e.g., 0.07625 for 7.625%): ");
        return scanner.nextDouble();
    }
    //Ask user for the amount of years pay out is expected
    public static int getNoOfYears(Scanner scanner){
        System.out.println("Expected years for pay out (Ex 12 for 12 years): ");
        return scanner.nextInt();
    }

    //Logic and present value calculations
    //PVA = P * (1-(1+r)^-n)/r
    //PVA = Present value of annuity
    //P = Payment per period
    //r = Interests rate per period in decimal
    //n = Number of periods (years * 12)
    public static double getPresentValueAnnuity(double payment, double interestRate, int noOfPeriods){
        return payment * (1-Math.pow((1+interestRate),-noOfPeriods))/interestRate;
    }

    //User Output display
    public static void disUserOutput(double monthlyPay, int noOfYears, double interestRate, double presentValueAnnuity){
        System.out.println("Your Present Value calculator info is: ");
        //System.out.println("To fund an annuity that pays $" + monthlyPay + " monthly for " + noOfYears +" years and earns an expected " + interestRate + "% interest, you would need to invest $" + presentValueAnnuity + " today.");
        System.out.printf("To fund an annuity that pays $%,.2f monthly for %d years and earns an expected %.4f%% interest,%n" + "you would need to invest $%,.2f today.%n", monthlyPay, noOfYears, interestRate, presentValueAnnuity);
    }

    public static void main(String[] args) {
        //Initialize scanner
        Scanner scanner = new Scanner(System.in);

        //User inputs
        double monthlyPayout = getMonthlyPayout(scanner);
        double interestRate = getInterestRate(scanner);
        int noOfYears = getNoOfYears( scanner);
        int noOfPeriods = noOfYears * 12;

        //PVA calculation
        double presentValueAnnuity = getPresentValueAnnuity(monthlyPayout, interestRate, noOfPeriods);

        //Display Output
        disUserOutput(monthlyPayout, noOfYears, interestRate,presentValueAnnuity);

        scanner.close();

    }
}
