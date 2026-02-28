import java.util.Scanner;

public class LoginForm {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name;
        String password;
        
        //Wellcome Login Info

        System.out.println("Login Info");

        System.out.print("Enter the UserName: ");
        name = scanner.nextLine();

        System.out.print("Enter the Password: ");
        password = scanner.nextLine();

        if(name.equals("Admin") && password.equals("Admin")){

            System.out.println("UserName: " + name);
            System.out.println("Password: "+ password);
            System.out.println("Login was Success");
        }else{
            System.out.println("Enter the Valid User Login");
        }

        scanner.close();
        
    }
}
