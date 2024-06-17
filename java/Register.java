
public class Register {
   
    private String accountNumber;
    private String name;
    private double balance;
    private String password;

    public Register(String accountNumber, String name, double initialBalance, String password) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = initialBalance;
        this.password = password;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }
    public String getPassword(){
        return password;
    }

    public double getBalance() {
       
        return balance;
    }
    
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    
    public double checkBalance(){
        return balance;
    }

    

}
