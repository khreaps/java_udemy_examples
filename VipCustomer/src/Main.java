public class Main {
 
    public static void main(String[] args) {

        VipCustomer vC = new VipCustomer("ricardo", 2000, "pepito@xmas.com");

        System.out.println(vC.getName());
        System.out.println(vC.getCreditLimit());
        System.out.println(vC.getEmail());


    }
}
