package workshop.core;
import java.io.Console;
import java.util.ArrayList; // import the ArrayList class
import java.util.List;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  
import java.util.UUID;

public class BankAccount {
    Console cons = System.console();
    Date date = Calendar.getInstance().getTime();
    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
    String strDate = dateFormat.format(date);  

    //? Properties (Members)
    private String user;
    private String accountNumber = UUID.randomUUID().toString().substring(0,8);
    private Float accountBalance;
    private List<String> transactions = new ArrayList<>();
    private Boolean isClosed = false;
    private Long createdDate;
    private Long closedDate;

    //? Generate Getter & Setter
    public String getUser() {
        return user;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public Float getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(Float accountBalance) {
        this.accountBalance = accountBalance;
    }
    public List<String> getTransactions() {
        return transactions;
    }
    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }
    public Boolean getIsClosed() {
        return isClosed;
    }
    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }
    public Long getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }
    public Long getClosedDate() {
        return closedDate;
    }
    public void setClosedDate(Long closedDate) {
        this.closedDate = closedDate;
    }

    //? Constructor
    public BankAccount(String user){
        int randomNum = (int)(Math.random() * 1001);
        // String generateAccNumber = Integer.toString(randomNum);

        this.user = user;
        // this.accountNumber = generateAccNumber;
        this.accountBalance = 0f;
    }

    public BankAccount(String user, Float accountBalance){
        this.user = user;
        this.accountBalance = accountBalance;
    }

    //? Method
    public void deposit() {
        System.out.println("Enter an amount to deposit: ");
        String input = cons.readLine(">");
        String depositTransaction = ("Deposit $" + input + " at " + strDate + "\n");
        transactions.add(depositTransaction);
        System.out.print(depositTransaction);

        // Integer depositAmount = parseInt(input);
        // if (depositAmount < 0 ||isClosed.equals(true)) {
        //     System.println("IllegalArgumentException");
        // } else {
        //     System.println("Deposit succesfull");
        // }

        
    }

    public void withdraw() {
        String input = cons.readLine("Enter an amount to withdraw: ");
        String withdrawTransaction = ("Withdraw $" + input + " at " + strDate + "\n");
        transactions.add(withdrawTransaction);
        System.out.print(withdrawTransaction);
    }

    public void checkTransactions() {
        System.out.print(transactions);
    }
}
