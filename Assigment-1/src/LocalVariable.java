import java.util.Scanner;

public class LocalVariable {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int Stock;
        int total;

        System.out.print("Enter the Product Stock: ");
        Stock = scanner.nextInt();

        if (Stock > 0) {
            total = Stock * 10;
        } else {
            total = 0;
        }

        System.out.println(total);

        scanner.close();
    }

}
