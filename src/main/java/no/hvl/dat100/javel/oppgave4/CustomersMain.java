package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        // Test
        Customers group = new Customers(5);
        group.addCustomer(new Customer("Ael", "aelmail", 1, PowerAgreementType.POWERSUPPORT));
        group.addCustomer(new Customer("Oskar", "Oskarpost", 2, PowerAgreementType.NORGESPRICE));
        group.addCustomer(new Customer("theeeeee", "aura.net", 3, PowerAgreementType.SPOTPRICE));

        Customer[] active_customers = group.getCustomers();
        for (Customer customer : active_customers) {
            System.out.println(customer.toString() + "\n");
        }

        group.removeCustomer(2);
        System.out.println(group.getCustomer(2));
    }
}
