import java.util.Scanner;

public class NaturalNumber {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n;  
        int sum;

        System.out.print("Enter the Number: ");
        n = scanner.nextInt();

        if (n > 0) {
            sum = n * (n + 1) / 2;
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        } 
        else if (n == 0) {
            System.out.println("Sum is 0");
        } 
        else {
            System.out.println("Please enter a positive number.");
        }

        scanner.close();
    }
}
