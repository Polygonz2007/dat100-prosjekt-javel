package no.hvl.dat100.javel.oppgave3;

public class Customer {

    // TODO - object variables (attributes)
    private String name;
    private String email;
    private int customer_id;
    private PowerAgreementType agreement;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {
        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement;
    }

    // TODO - getter/setter methods for all objectvariables
    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return this.email; }

    public void setCustomerId(int customer_id) { this.customer_id = customer_id; }
    public int getCustomerId() { return this.customer_id; }

    public void setAgreement(PowerAgreementType agreement) { this.agreement = agreement; }
    public PowerAgreementType getAgreement() { return this.agreement; }


    // TODO - toString method
    public String toString() {
        return "Customer #" + this.customer_id + "\nName: " + this.name + "\nE-Mail: " + this.email + "\nPower Agreement: " + this.agreement.toString();
    }
}
