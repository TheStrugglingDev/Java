public class Main {
    public static void main(String[] args) {

        Account georgesAccount = new Account();
        georgesAccount.setNumber("29391");
        georgesAccount.setBalance(3000);
        georgesAccount.setCustomerName("George Owen");
        georgesAccount.setCustomerEmail("george@owen.com");
        georgesAccount.setCustomerPhone("(082)145-5912");
        georgesAccount.withdrawFunds(100);
        georgesAccount.depositFunds(500);
        georgesAccount.withdrawFunds(200);
        georgesAccount.withdrawFunds(300);

    }
}
