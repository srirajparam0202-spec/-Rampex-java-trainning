package Day_7.hometask;

public class OddEven {

        public static void main(String[] args) {

            int[] arr = {2, 5, 7, 8, 10, 13, 4, 9};

            int even = 0;
            int odd = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            System.out.println("Even Count = " + even);
            System.out.println("Odd Count = " + odd);
        }
    }

