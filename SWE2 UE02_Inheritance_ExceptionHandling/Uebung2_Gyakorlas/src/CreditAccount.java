import javax.security.auth.login.AccountException;

public class CreditAccount extends Account{
    public CreditAccount(int currentBalance) {
        super();
        this.balance = currentBalance;
    }

    @Override
    public void deposit(int amount) {
        if (amount > -1 * balance ) {
            balance = 0;
        } else {
            super.deposit(amount);
        }
    }

    @Override
    public void withdraw(int amount) throws AccountException {
        throw new AccountException("Cannot withdraw money from a credit acount. Transaction failed");

    }


}
