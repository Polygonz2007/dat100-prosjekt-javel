package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        // Test cutsomer
        Customer oskar = new Customer("Oskar Gønnerik Keeznes", "agentorw@keezy.letsgetit", 2, PowerAgreementType.SPOTPRICE);
        System.out.println(oskar.toString() + "\n");
        System.out.println("Oskar bruker " + oskar.getAgreement() + " og er customer id " + oskar.getCustomerId() + "\n");

        // Change some things
        oskar.setAgreement(PowerAgreementType.NORGESPRICE);
        oskar.setEmail("oskar@madmail.net");

        // Print again
        System.out.println(oskar.toString());
    }
}
