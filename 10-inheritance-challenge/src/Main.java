public class Main {
    public static void main(String[] args) {

        Employee george = new Employee("George", "10/10/1994",
                "04/04/2025");
        System.out.println(george);
        System.out.println("Age = " + george.getAge());
        System.out.println("Pay = " + george.collectPay());

        SalariedEmployee john = new SalariedEmployee("John", "02/02/1990",
                "06/06/2025", 35000);
        System.out.println(john);
        System.out.println("Age = " + john.getAge());
        System.out.println("John's Paycheck = $" + john.collectPay());

        john.retire();
        System.out.println("John's Pension check = $" + john.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "03/03/1960",
                "15/11/2019", 15);
        System.out.println(mary);
        System.out.println("Age = " + mary.getAge());
        System.out.println("Mary's Paycheck = " + mary.collectPay());
        System.out.println("Mary's Holiday Pay = " + mary.getDoublePay());
    }
}
