
import java.util.*;
import java.util.Scanner;


public class App {
    private static Scanner scanner=new Scanner(System.in);    
    private static Bank bank=new Bank();  

    public static void main(String args[]){
boolean ext=true;      
         while(ext){
            System.out.println("Welcome to Bank");
              System.out.println("Enter Your choice");
              System.out.println("1. Login");
              System.out.println("2. Register");
              System.out.println("3. Exit");
              int a=scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Login");
                    break;
                case 2:
                    System.out.println("Register");
                    break;
                case 3:
                    System.out.println("Thank you");
                    ext=false;
                    break;    
            
                default:
                    System.out.println("Invilid input4");
                    break;
            }
         }


    }
    private static void createAccount() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        bank.createAccount(accountNumber, name, initialBalance, password);
    }
    private static void loginAcount(){
        System.out.println("Enter account number: ");
        String accountNumber=scanner.nextLine();
        System.out.println("Enter password: ");
        String password=scanner.nextLine();
        Register user=bank.lognUser(accountNumber,password){
            if(user!=null){
                
            }
        }
    }
    
}
