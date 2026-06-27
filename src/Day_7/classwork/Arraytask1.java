package Day_7.classwork;

import java.util.Scanner;
import java.util.Arrays;
public class Arraytask1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int[] arr=new int[5];

        for (int i = 0; i < 5; i++) {
                System.out.println("enter the position:" + (i+1));
                arr[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));

        }
    }



