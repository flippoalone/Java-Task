import java.util.Scanner;

public class CompanySystem {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); 

        
        int empId;
        String empName;
       
        System.out.print("Enter the Empolyee ID:  ");
        empId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the Employee Name:  ");
        empName = scanner.nextLine();
        System.out.println();

        System.out.println("Employee ID: "+ empId);
        System.out.println("Employee Name: "+empName);
      

        if(empId == 0){ 
            empId = 100;
            System.out.println();
            System.out.println("Employee ID: " + empId);
            
            if (empName.isEmpty()) {
                
                empName = "Not Assigned";
                System.out.println("Emplouee Name: "+empName);
            }
        }

        scanner.close();

    }
    
}