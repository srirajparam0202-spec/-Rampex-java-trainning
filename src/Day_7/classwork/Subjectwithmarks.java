package Day_7.classwork;
import java.util.Scanner;
import java.util.Arrays;

public class Subjectwithmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name:");
        String name = sc.nextLine();

        System.out.print("enter your age:");
        int age = sc.nextInt();



        String[] subject = new String[5];
        int[] marks = new int[5];

        for (int i = 0; i< marks.length; i++) {


            System.out.print("enter the subject:");
            subject[i]=sc.next();

                System.out.print("enter the marks:");
                marks[i] = sc.nextInt();
            }
        System.out.print(Arrays.toString(subject));


        }
    }

