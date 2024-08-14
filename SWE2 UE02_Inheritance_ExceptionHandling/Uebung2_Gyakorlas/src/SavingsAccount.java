import javax.security.auth.login.AccountException;

public class SavingsAccount extends Account {

    @Override
    public void withdraw(int amount) throws AccountException {
        if (amount > balance) {
            throw new AccountException("Cannot overdraft on a savings account. Transaction failed.");
        } else {
            super.withdraw(amount);
        }
    }
}
