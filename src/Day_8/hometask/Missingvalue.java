package Day_8.hometask;
import java.util.Scanner;

public class Missingvalue {

        public static void main(String[] args) {

            int N = 8;
            int[] arr = {1, 2, 4, 5, 6, 7, 8};

            int actualSum = 0;

            for (int i = 0; i < arr.length; i++) {
                actualSum += arr[i];
            }

            int expectedSum = N * (N + 1) / 2;
            int missing = expectedSum - actualSum;

            System.out.println(missing);
        }
    }

