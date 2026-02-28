import java.util.Scanner;

public class Grade {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int mark;
        char Grad;

        System.out.print("Enter Your Mark: ");
        mark = scanner.nextInt();



        if(mark >= 70) {
            Grad = 'S';
            System.out.println("Your Mark " + mark + " and Grad " + Grad );
        }else if (mark >= 20){
            Grad = 'F';
            System.out.println("Your Mark " + mark + " and Grad "+ Grad + " your just Passed");
        } else if (mark >= 50) {
            Grad = 'A';
            System.out.println("Your Mark " + mark + " and Grad " + Grad );
        }else if (mark >= 40) {
            Grad = 'B';
            System.out.println("Your Mark " + mark + " and Grad " + Grad );
        } 

        System.out.println(mark);

        scanner.close();
    } 
}
