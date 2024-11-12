import Bank.current.CurrentAccount;
import Bank.savings.SavingsAccount;

public class BankAccountSystem2 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", "John Doe", 1000, 5);
        savings.displayAccountDetails();
        savings.deposit(500);
        savings.withdraw(200);
        savings.addInterest();
        savings.checkBalance();

        System.out.println();

        CurrentAccount current = new CurrentAccount("CA123", "Jane Smith", 2000, 500);
        current.displayAccountDetails();
        current.deposit(1000);
        current.withdraw(2500);
        current.withdraw(3000);
        current.checkBalance();
    }
}
