import javax.security.auth.login.AccountException;

public class AccountsTest {
    public static void main(String[] args) {
        testGiroAccount();
        testSavingsAccount();
        testCreditAccount();
    }


    public static void testGiroAccount() {
        System.out.println("Giro account test...");
        GiroAccount giroAccount = new GiroAccount(1000);
        try {
            giroAccount.deposit(500);
            giroAccount.withdraw(1500);
            System.out.println("Giro account is correct and ready to use.");
        } catch (AccountException ex) {
            System.out.println("Giro account failed: " + ex.getMessage() );
        }

    }

    public static void testSavingsAccount() {
        System.out.println("Saving account test...");
        SavingsAccount savingsAccount = new SavingsAccount();
        try {
            savingsAccount.deposit(1000);
            savingsAccount.withdraw(500);
            savingsAccount.withdraw(600);
            System.out.println("Saving account is correct and ready to use.");
        } catch (AccountException ex) {
            System.out.println("Saving account failed: " + ex.getMessage());
        }
    }

    public static void testCreditAccount() {
        System.out.println("Credit account test...");
        CreditAccount creditAccount = new CreditAccount(-5000);
        try {
            creditAccount.deposit(5000);
            creditAccount.deposit(100);
            creditAccount.withdraw(100);
            System.out.println("Credit account is correct and ready to use.");
        } catch (AccountException ex) {
            System.out.println("Credit account failed: " + ex.getMessage());
        }
    }

    }

