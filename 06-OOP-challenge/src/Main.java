public class Main {
    public static void main(String[] args) {

        Account georgesAccount = new Account("32141", 2000, "George Owen",
                "george@owen.com", "(082)145-5912");

        System.out.println(georgesAccount.getNumber());
        System.out.println(georgesAccount.getBalance());

//        georgesAccount.setNumber("29391");
//        georgesAccount.setBalance(3000);
//        georgesAccount.setCustomerName("George Owen");
//        georgesAccount.setCustomerEmail("george@owen.com");
//        georgesAccount.setCustomerPhone("(082)145-5912");

        georgesAccount.withdrawFunds(100);
        georgesAccount.depositFunds(500);
        georgesAccount.withdrawFunds(200);
        georgesAccount.withdrawFunds(300);

    }
}
