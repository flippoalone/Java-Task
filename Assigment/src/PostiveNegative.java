import java.util.Scanner;

public class PostiveNegative {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number;

        //System.out.println("The limit if number to enter is (1 to 10 or -1 to -10)");

        System.out.print("Enter the Positive or Negative or Zero: ");
        number = scanner.nextInt();

        if(number  > 0 ){
            System.out.print("Positive Number " + number);

        }else if(number < -0){
            System.out.println("Negative Number "+ number);

        }else {
            number = 0;
            System.out.println("The number is Zero ");
        }
    


        scanner.close();

    }
}
