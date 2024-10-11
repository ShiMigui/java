import assets.accounts.BankAccount;
import assets.accounts.BankAccountFactory;
import assets.enums.AccountType;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        BankAccount c1 = BankAccountFactory.createAccount("Kayk Eduardo", AccountType.SAVINGS);
        c1.deposit(1700.00);
        System.out.println(c1 + "\n");

        BankAccount c2 = BankAccountFactory.createAccount("Juliany Stephano", AccountType.CHECKING);
        c2.deposit(1530.00);
        System.out.println(c2 + "\n");

        BankAccount c3 = BankAccountFactory.createAccount("Rebeca Cristine", AccountType.CHECKING);
        c3.deposit(1530.00);
        System.out.println(c3 + "\n");
        
        c1.transferTo(c2, 1000.00);
        c2.transferTo(3, 9.99);
        c1.transferTo(c3, 100.00);
    }
}
