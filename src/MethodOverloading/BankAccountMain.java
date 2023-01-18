package MethodOverloading;

public class BankAccountMain {

    public static void main(String[] args) {

        // Creating John bank account with empty constructor.
        System.out.println("\n============= John's Bank Account ==============");
        BankAccount johnAccount = new BankAccount();

        johnAccount.withdrawal(50);
        johnAccount.deposit(1_500);
        johnAccount.withdrawal(50);

        // Creating a Pete bank account with given parameters.
        System.out.println("\n============= Peter's Bank Account ==============");
        BankAccount peteAccount = new BankAccount("EE882200199230", 9_210, "Peter",
                "pete@email.com", "372 5555 5555");

        peteAccount.deposit(200);
        peteAccount.withdrawal(11_000);

        // Creating a Oleg bank account with given parameters.
        System.out.println("\n============= Oleg's Bank Account ==============");
        BankAccount olegAccount = new BankAccount("EE99110022338877", 1_000_000);

        olegAccount.deposit(1_200_000);
        olegAccount.withdrawal(11_900);
    }
}
