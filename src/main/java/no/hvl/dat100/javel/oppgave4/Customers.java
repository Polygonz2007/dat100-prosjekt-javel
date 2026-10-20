package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {
        customers = new Customer[size];
    }

    // b) count number of non-null references
    public int countNonNull() {
        int count = 0;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) count++;
        }

        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) continue;
            if (customers[i].getCustomerId() == customer_id) return customers[i];
        }

        return null;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = c;
                return true;
            }
        }

        return false;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) continue;
            if (customers[i].getCustomerId() == customer_id) {
                Customer c = customers[i];
                customers[i] = null;
                return c;
            }
        }

        return null;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        Customer[] new_customers;

        // Count customers
        int count = 0;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) count++;
        }

        // Create
        new_customers = new Customer[count];
        int index = 0;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) continue;
            new_customers[index] = customers[i];
            index++;
        }

        return new_customers;
    }
}