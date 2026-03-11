class Phone {
    String model = "Samsung";
    double price = 20.000;

    void list() {
     System.out.println("Model: "+ model);
    System.out.println("Price: "+price);

}

}


public class MobileShop {

    public static void main(String[] args){

    Phone phone = new Phone();
    phone.list();
    

    }
    
}
