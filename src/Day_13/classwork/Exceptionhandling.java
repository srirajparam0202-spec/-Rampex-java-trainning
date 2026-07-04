package Day_13.classwork;
import java.util.Scanner;

public class Exceptionhandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter a number:");
        try {
            int a = sc.nextInt();
            System.out.println(a*a);
        }
    catch(Exception e) {

    }

    }
}
