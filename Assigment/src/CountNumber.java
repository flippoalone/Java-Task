public class CountNumber {
    
    public static void main(String[] args){

         int number = 12345;   
        int count = 0;

        
        if (number == 0) {
            count = 1;
        } 
        else {
         
            if (number < 0) {
                number = -number;
            }

            while (number > 0) {
                number = number / 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);


    }
}
