import javax.security.auth.login.AccountException;

public class GiroAccount extends Account {
    private int overdraftLimit;

    public GiroAccount(int overdraftLimit) {
        super();
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(int amount) throws AccountException {
        if (amount > balance + overdraftLimit) {
            throw new AccountException("Overdraft limit exceeded. Transaction failed.");
        } else {
            super.withdraw(amount);

        }
    }
}