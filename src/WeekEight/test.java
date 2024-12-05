package WeekEight;

public class test {
    public static void main(String[] args) {
        BankAccount newAccount = new RegularAccount("James", "Regular", 120000, 6);
        PremiumAccount savings = new PremiumAccount("James", "Premium", 120000, 10000);
        System.out.println(newAccount);
        System.out.println(savings);
    }
}
