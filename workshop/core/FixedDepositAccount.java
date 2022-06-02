package workshop.core;

public class FixedDepositAccount extends BankAccount {
    public FixedDepositAccount(String name, float initialBal) {
        //? Call parent class before the constructor
        //? can only be used in constructor and must be the first line. There can't be a code that lies above it
        super(name, initialBal);
        
        
        
    }
}
