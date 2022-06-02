package workshop.core;

public class Main {
    public static void main(String[]args) {


        //? Instantiate a new account
        BankAccount user01 = new BankAccount("Chrysalis");
        System.out.printf("Account user is: %s \n", user01.getUser());
        System.out.printf("Account number: %s \n", user01.getAccountNumber());

        user01.deposit(); 
        user01.withdraw();
        user01.checkTransactions();
    }
}