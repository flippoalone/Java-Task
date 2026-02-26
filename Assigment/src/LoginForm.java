import java.util.Scanner;

public class LoginForm {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        String userName;
        String password;
        String status = "Login Succes";

        System.out.print("Enter the UserName: ");
        userName = scanner.nextLine();


        System.out.print("Enter the Password: ");
        password = scanner.nextLine();

        if(userName.equals(" ") && password.equals(" ")) {
            
            System.out.println("Status: "+ status);
        } 

        System.out.println("Status: "+ status);

        scanner.close();



    }
}
