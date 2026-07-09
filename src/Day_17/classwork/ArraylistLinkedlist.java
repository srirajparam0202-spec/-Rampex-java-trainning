package Day_17.classwork;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArraylistLinkedlist {
    public static void main(String[] args) {

        ArrayList<Integer> arr= new ArrayList<>();
        LinkedList<Integer> li= new LinkedList<>();

long start=System.nanoTime();

for(int i=0;i<=10000;i++){

    arr.add(i);
}

long end=System.nanoTime();

        System.out.println("added in Arraylist in " + (end-start));

    }
}
