public class BankAccountC {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNum;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void depositFunds(double funds) {
        if (funds < 0) {
            return;
        }
        this.balance += funds;
    }

    public void withdrawFunds(double withdraw) {
        if (withdraw < 0 || withdraw > this.balance) {
            return;
        }
        this.balance -= withdraw;
    }
}