import java.util.Scanner;

public class LargerTwoNumber {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        int number1;
        int number2;
        int largest;


        System.out.print("Enter the First Number: ");
        number1 = scanner.nextInt();

        System.out.print("Enter the Second Number: ");
        number2 = scanner.nextInt();

        if(number1 > number2) {          
            largest = number1;
            System.out.println("The largest Number is: " + largest);

        } else if (number2 > number1){
            largest = number2;
            System.out.println("The largest Number is: " + largest);
        }
         




        scanner.close();
    }
}
