package Day_8.classwork;
import java.util.Scanner;
import java.util.Arrays;

public class Reversethearray {
    public static void main(String[] args) {
        String[] menu={"veg","non-neg","sweets","beverages"};
        String[] m1=new String[menu.length];

        for(int i=0;i<menu.length;i++){

            m1[i]=menu[menu.length-1-i];

        }
        for(int i=0;i<menu.length;i++) {

            m1[i] = menu[menu.length - 1 - i];
        }
            System.out.print(Arrays.toString(m1));
    }
}
