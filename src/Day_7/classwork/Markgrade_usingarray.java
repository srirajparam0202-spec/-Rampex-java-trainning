package Day_7.classwork;
import java.util.Scanner;
import java.util.Arrays;

public class Markgrade_usingarray {
    public static void main(String[] args) {

        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Candidate name:" );
        String name = sc.nextLine();
        for (int i = 0; i < marks.length; i++) {


            System.out.print("enter the marks:");
            marks[i] = sc.nextInt();
        }

        int totalmarks=0;

        for(int i=0;i<marks.length;i++){

            totalmarks=totalmarks+marks[i];

        }
        System.out.println("congrats " +  name  + " you scored " + totalmarks);
        System.out.println("percentage is :" +totalmarks/5.0);

        System.out.println(Arrays.toString(marks));
    }
}
