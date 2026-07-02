package Day_11.classwork;

public class Amstrong {
    public static void main(String[] args) {
        checkAmstrong(140);

        
    }
    public static boolean checkAmstrong(int num){
        int digit=0;

        while(num!=0){

            num=num/10;
            digit++;

        }
        System.out.println("number of digits : "+digit);
        return true;
    }

}
