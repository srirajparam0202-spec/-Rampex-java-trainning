package Day_20;

import java.util.Arrays;

public class SreamDemo2 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 6, 8, 9, 1, 5, 7, 10};

        Arrays.stream(arr).filter((n)->n%2!=0).sorted().forEach(n->System.out.println(n));
    }
}


