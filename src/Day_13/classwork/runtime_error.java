package Day_13.classwork;
import java.util.Scanner;

public class runtime_error {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c= 5;
        int x=a/(b+c);
        System.out.println(x);
        int y=a/(b-c);
        System.out.println(y);
    }
}
