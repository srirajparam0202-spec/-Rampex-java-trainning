package Day_8.classwork;
import java.util.Arrays;

public class Rotation2 {
    public static void main(String[] args) {

        int[] num={1,2,3,4};
        int temp=0;
        int n=num.length;

        for(int i=0;i<num.length/2;i++){

            temp=num[i];
            num[i]=num[n-1-i];
            num[n-1-i]=temp;
        }
        System.out.println(Arrays.toString(num));

    }
}
