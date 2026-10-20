package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.time.Month;
import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {
        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
    }

    public void computeAmount() {
        PowerAgreementType agreement = c.getAgreement();
        if (agreement == PowerAgreementType.SPOTPRICE)
            amount = MonthlyPower.computeSpotPrice(this.usage, this.prices);
        else if (agreement == PowerAgreementType.POWERSUPPORT)
            amount = MonthlyPower.computeSpotPrice(this.usage, this.prices) - MonthlyPower.computePowerSupport(this.usage, this.prices);
        else if (agreement == PowerAgreementType.NORGESPRICE)
            amount = MonthlyPower.computeNorgesPrice(this.usage);
        else
            System.out.println("User has unknown power agreement.");
    }

    public void printInvoice() {
        System.out.println("========================");
        System.out.println("Customer number " + this.c.getCustomerId());
        System.out.println("Name " + this.c.getName());
        System.out.println("Email " + this.c.getEmail());
        System.out.println("Agreement " + this.c.getAgreement());
        System.out.println("");
        System.out.println("Month: " + this.month);
        System.out.printf("Usage: %.2f kWh\n", MonthlyPower.computePowerUsage(this.usage));
        System.out.printf("Amount: %.2f NOK\n", amount);
        System.out.println("========================");
    }
}
