package Day_8.hometask;
import java.util.Scanner;

public class Missingvalue2 {

        public static void main(String[] args) {

            int N = 10;
            int[] arr = {2, 1, 3, 4, 5, 6, 7, 9, 10};

            int actualSum = 0;

            for (int i = 0; i < arr.length; i++) {
                actualSum += arr[i];
            }

            int expectedSum = N * (N + 1) / 2;
            int missing = expectedSum - actualSum;

            System.out.println(missing);
        }
    }

