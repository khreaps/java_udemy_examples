public class Main {

    public static void main(String[] args) {

        BankAccountC ba = new BankAccountC();

        ba.setAccountNumber(20201001);
        ba.setBalance(100.50);
        ba.setCustomerName("Ricardo Galvez");
        ba.setEmail("p@pp.com");
        ba.setPhoneNum("999941299");

        System.out.println(ba.getAccountNumber());
        System.out.println(ba.getBalance());
        System.out.println(ba.getCustomerName());
        System.out.println(ba.getEmail());
        System.out.println(ba.getPhoneNum());

        ba.depositFunds(10);
        System.out.println(ba.getBalance());

        ba.withdrawFunds(100);
        System.out.println(ba.getBalance());
    }
}
