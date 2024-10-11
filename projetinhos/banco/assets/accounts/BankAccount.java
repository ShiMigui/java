package assets.accounts;

import assets.enums.AccountType;
import assets.exceptions.*;

public class BankAccount {
    static private StringBuilder str = new StringBuilder();

    AccountType type;
    Integer id;
    String name;
    boolean open;
    double balance;

    public BankAccount(AccountType type, Integer id, String name, boolean open, double balance) {
        setId(id);
        setName(name);
        setOpen(open);
        setType(type);
        setBalance(balance);
    }

    public BankAccount(AccountType type, Integer id, String name, double balance) {
        setId(id);
        setName(name);
        setOpen(true);
        setType(type);
        setBalance(balance);
    }

    public void withdraw(double amount) {
        isOpenOr("Cannot withdraw; the account is closed!");
        if (!hasInBalance(amount)) {
            throw new InsufficientBalanceException("Cannot withdraw; the account does not have sufficient balance!");
        }
        decreaseBalance(amount);    
    }

    public void deposit(double amount) {
        isOpenOr("Cannot deposit; the account is closed!");
        increaseBalance(amount);
    }

    public void transferTo(BankAccount target, double amount) {
        isOpenOr("Cannot transfer; the account is closed!");
        if (this.equals(target)) {
            throw new TransferException("Cannot transfer to itself!");
        }
        if (hasInBalance(amount)) {
            decreaseBalance(amount);
            target.deposit(amount);
            System.out.println(String.format("(%.2f) FROM '%s' TO '%s'", amount,  this.name, target.name));
        } else throw new InsufficientBalanceException("Cannot transfer; insufficient balance!");
    }

    public void transferTo(Integer id, double amount) {
        transferTo(BankAccountFactory.getAccount(id), amount);
    }

    private void setId(Integer id) {
        if (this.id != null) {
            throw new AccountException("The account's ID is already set! It cannot be set again.");
        }
        this.id = id;
    }
    private void setName(String name) { this.name = name.toUpperCase(); }
    private void setOpen(boolean open) { this.open = open; }
    private void setType(AccountType type) { this.type = type; }
    private void setBalance(double balance) { this.balance = balance; }

    private void increaseBalance(double value) { this.balance += value; }
    private void decreaseBalance(double value) { this.balance -= value; }

    public Integer getId(){ return this.id; }
    public String getName(){ return this.name; }
    public boolean isOpen(){ return this.open; }
    public AccountType getType(){ return this.type; }
    public double getBalance(){ return this.balance; }

    protected boolean hasInBalance(double value) {
        return getBalance() >= value;
    }

    protected void isOpenOr(String arg) {
        if (!isOpen()) {
            throw new ClosedAccountException(arg);
        }
    }

    @Override
    public String toString() {
        str.setLength(0);
        str.append("ID: ").append(getId()).append("\n");
        str.append("Type: ").append(getType().getDescription()).append("\n");
        str.append("Status: ").append(isOpen() ? "Opened" : "Closed").append("\n");
        str.append("Name: ").append(getName()).append("\n");
        str.append("Balance: ").append(getBalance());

        return str.toString();
    }

    @Override
    public boolean equals(Object obj) {
        BankAccount other = (BankAccount) obj;
        return (this == obj || other.getId() == this.id);
    }
}
