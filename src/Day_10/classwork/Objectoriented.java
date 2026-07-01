package Day_10.classwork;
public class Objectoriented {
    public static void main(String[] args) {
        Laptop l1=new Laptop();
        l1.browse();
    }
}

class Laptop{
    String brand;
    String model;

    public void browse(){
        System.out.println("browsing..");
    }
}
