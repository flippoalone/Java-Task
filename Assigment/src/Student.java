class Student {
    
    // Instance variables (belong to each object)
    String name;
    int rollNumber;

    // Constructor
    Student(String name, int rollNumber) {
        name = name;
        rollNumber = rollNumber;
    }

    // Method to calculate total marks
    void calculateTotal() {
        int mark1 = 80;
        int mark2 = 75;
        int mark3 = 85;

        // Local variable (used only inside this method)
        int totalMarks = mark1 + mark2 + mark3;

        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 101);
        s1.calculateTotal();
    }
}