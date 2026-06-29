package Day_8.classwork;
import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {
        int[] num={1,2,3,4};

        int temp=num[0];

        num[0]=num[3];
        num[3]=temp;

        temp=num[1];
        num[1]=num[2];
        num[2]=temp;

        System.out.println(Arrays.toString(num));

    }
}
