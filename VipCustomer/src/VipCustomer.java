public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("default name", 1500, "default email 1");
    }

    public VipCustomer(String name, double creditLimit) {

        this(name, creditLimit, "default email 2");
    }

    public VipCustomer(String name, double creditLimit, String email) {

        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

}
