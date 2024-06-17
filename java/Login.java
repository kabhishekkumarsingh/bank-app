import java.util.Scanner;

public class Login {


public static void loginUser(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter Account Number");
    String username=scanner.nextLine();
    System.out.println("Enter Password");
    String password=scanner.nextLine();


    System.out.println("Login successfull");
}
     
}