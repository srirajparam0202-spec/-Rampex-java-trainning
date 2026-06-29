package Day_8.classwork;
import java.util.Arrays;

public class Rotation3 {
    public static void main(String[] args) {


        int[] num={1,2,3,4};
        int n=num.length;

        int left=0;
        int right=n-1;
        int temp;

        for(int i=1;i<=n/2;i++){
            temp=num[left];
            num[left]=num[right];
            num[right]=temp;

            left++;
            right--;
        }
        System.out.println(Arrays.toString(num));

    }
}
