import java.util.Scanner;
import java.util.ArrayList;
public class Bank {
    Scanner scanner=new Scanner(System.in); 
    private ArrayList<Register>users;
    public Bank(){
        users=new ArrayList<>();
    }
    public void createAccount(String accountNumber, String name, double initialBalance, String password) {
        Register newUser = new Register(accountNumber, name, initialBalance, password);
        users.add(newUser);
        System.out.println("Account created successfully.");
    }
    public void loginAcount(String accountNumber,String password){
        for(Register user:users){
             if(user.getAccountNumber().equals(accountNumber) && user.getPassword().equals(password)){
                Boolean f=true;

                while(f){
                    System.out.println("\nWelcome to the Bank Application");
                    System.out.println("1. Deposit Money");
                    System.out.println("2. Withdraw Money");
                    System.out.println("3. Check Balance");
                    System.out.println("4. Exit");
                    System.out.println("Enter your choice: ");
                    int choice=scanner.nextInt();    
                    scanner.nextLine();
                    
                    switch (choice) {
                        case 1:
                        System.out.println("Enter your amount: ");
                        double amount=scanner.nextDouble();
                        double ans=user.getBalance();
                        user.setBalance(ans+amount);
                            break;
                        case 2:
                             System.out.println("Enter amount to withdrawal");
                             double amoun=scanner.nextDouble();
                             user.setBalance(user.getBalance()-amoun);
                            break;
                        case 3:
                            user.checkBalance();
                            break;
                        case 4:
                             f=false;
                             System.out.println("Thank you");
                            break;
                        default:
                        System.out.println("Invalid input");
                }
               }
             }
        }
    }


   
}


