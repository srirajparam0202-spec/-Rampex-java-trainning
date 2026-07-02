package Day_11.classwork;

public class Polymorphism {
    public static void main(String[] args) {
        greet("raj");
    }
    public static void greet(){
        System.out.println("good morning");
    }
    public static void greet(String name){
        System.out.println("good morning;" +name);
    }

}
