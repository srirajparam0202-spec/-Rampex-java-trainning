package Day_8.hometask;

public class Removeduplicate2 {

        public static void main(String[] args) {

            int[] arr = {1, 1, 1, 2, 2, 3, 4, 4};

            for (int i = 0; i < arr.length; i++) {
                boolean found = false;

                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

