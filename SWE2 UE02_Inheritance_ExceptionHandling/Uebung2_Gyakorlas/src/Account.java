import javax.security.auth.login.AccountException;

public abstract class Account {
    private static int nextId = 123;
    private final int accountNumber;
    protected int balance;

    public Account() {
        this.accountNumber = nextId;
        nextId += 1;
        this.balance = 0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) throws AccountException {
        if(amount > balance) {
            throw new AccountException("Insufficient funds");
        } else {
            balance -= amount;
        }
    }

    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }
}
