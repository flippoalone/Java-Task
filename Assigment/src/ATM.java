import java.util.Scanner;

public class ATM {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int amountBlance = 10000;
        int showBlance;
        int widthdraw;


        System.out.println("Bank Account Blance");

        System.out.print("Enter the Amount you want to Widthdraw: ");
        widthdraw = scanner.nextInt();
    
        if(widthdraw > amountBlance){
           
            System.out.println("Insufficient Balance");

        }else if(widthdraw == amountBlance){
            System.out.println("Account should Not be Empty ");
            System.out.println("You have only "+ amountBlance + " in your Account");

        }else if(widthdraw < 0){
            System.out.println("Invalid Amount");

        }else{
            showBlance = (widthdraw-amountBlance);
            System.out.println("The Remaing  Blance is "+showBlance);
        }

    

        scanner.close();

    }
}
