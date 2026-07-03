package Day_12.classwork;

public class PhoneOop {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Sim jio=new Sim();

        p1.call(jio,701018);


    }
}
class Phone{
        public void call(Sim s,int num){

    System.out.println("calling..."+num);
    }


}

class Sim{

}



