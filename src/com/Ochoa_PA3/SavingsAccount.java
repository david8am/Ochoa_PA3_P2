package com.Ochoa_PA3;

public class SavingsAccount{
    static double annualInterestRate;
    private double savingsBalance;


    public static void main(String[] args) {
	SavingsAccount saver1 = new SavingsAccount(2000);
	SavingsAccount saver2 = new SavingsAccount(3000);
    double totalInterest1 = 0;
    double totalInterest2 = 0;

	saver1.modifyInterestRate(.04);
	saver2.modifyInterestRate(.04);

	for(int i = 0; i < 12; i++){

	    saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
    }
	System.out.println("The total balance for account 1 after 12 months is: " + saver1.getSavingsBalance() + " and the total for account 2 is: " + saver2.getSavingsBalance());

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("The total balance for account 1 after 13 months is: " + saver1.getSavingsBalance() + " and the total for account 2 is: " + saver2.getSavingsBalance());




    }

    public double calculateMonthlyInterest(){
        double monthlyInterest = savingsBalance * annualInterestRate / 12;
        savingsBalance += monthlyInterest;
        return monthlyInterest;
    }

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }


    public static void modifyInterestRate(double newInterestRate){
        annualInterestRate = newInterestRate;

    }
}


