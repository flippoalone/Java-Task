import java.util.Scanner;

public class Ecommer {

    public static void main(String[] args){
        //An e-commerce application calculates discount only when order amount exceeds ₹5000.
        //The discount value is printed after the condition block.

        Scanner scanner = new  Scanner(System.in);

        double price;
        double discount;
        double Total;

        System.out.print("Enter the Price of the Product: $ ");
        price = scanner.nextDouble();

        System.out.print("Enter what discount if you have in the Coupen: ");
        discount = scanner.nextDouble();

        Total = price * discount /100;

        if(price >= 5000) {
            System.out.println("You got the Discount of "+ discount + "%");
        } else if (price < 1000)
            {
            System.out.println("You don't have any Discount");
        }

        System.out.println("The total Product Cost: $"+ Total);


        scanner.close();


    }
    
}
