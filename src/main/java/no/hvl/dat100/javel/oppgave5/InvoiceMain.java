package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave4.Customers;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        String[] names = {"Rolf", "Gunnar", "Einar"};
        Customers nabolag = new Customers(3);
        Invoice[] invoices = new Invoice[3];

        double[][][] power_usages = {
                CustomerPowerUsageData.usage_month_customer1,
                CustomerPowerUsageData.usage_month_customer2,
                CustomerPowerUsageData.usage_month_customer3
        };

        for (int i = 0; i < names.length; i++) {
            // Customer
            String name = names[i];
            Customer c = new Customer(name, name + "@mail.net", i, PowerAgreementType.values()[i]);
            nabolag.addCustomer(c);

            // Invoice
            invoices[i] = new Invoice(c, "Januar", power_usages[i], MonthPowerData.powerprices_month);
            invoices[i].computeAmount();
        }

        Invoices.processInvoices(invoices);

    }
}
