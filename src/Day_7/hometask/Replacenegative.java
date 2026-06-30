package Day_7.hometask;

public class Replacenegative {

        public static void main(String[] args) {

            int[] arr = {5, -3, 8, -1, 0, -7, 4};

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    arr[i] = 0;
                }
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

