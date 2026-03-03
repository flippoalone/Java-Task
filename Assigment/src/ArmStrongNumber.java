import java.util.Scanner;

public class ArmStrongNumber {
    
    public static void main(String[] args){
        
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int number = scanner.nextInt();

        int num = number;
        int sum = 0;

        int digits;

        while(number > 0){
            digits = number %10;
            sum = sum + (digits * digits * digits);
            number = number /10;
        }

        if(sum == num){
            System.out.println("ArmStrong Number");

        }else{
            System.out.println("Not an ArmStrong Number");
        }

        scanner.close();
    }

}
