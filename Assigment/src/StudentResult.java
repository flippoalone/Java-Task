class Students{

    int rollNo;
    String name;
    int mark1, mark2, mark3;


    Students(int r, String n, int m1, int m2, int m3) {
        rollNo = r;
        name = n;
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    void displayResult() {

        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;
        String grade;

        if (average >= 80) {
            grade = "A";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 40) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }

}

public class StudentResult {
      public static void main(String[] args) {

        Students s1 = new Students(1, "Rahul", 85, 78, 90);
        Students s2 = new Students(2, "Priya", 60, 65, 70);
        Students s3 = new Students(3, "Amit", 40, 45, 50);
        
        
        s1.displayResult();
        s2.displayResult();
        s3.displayResult();
       
    }
}
