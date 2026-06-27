package Day_7.classwork;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int Smax=0;
        int max=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                Smax=max;
                max=arr[i];
            }
        }
        System.out.println("Smax is: "+Smax);
    }
}
