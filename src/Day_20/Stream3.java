package Day_20;
import java.util.stream.Stream;
public class Stream3 {
    public static void main(String [] args){
        Stream.iterate(0,n->n+2).limit(5).forEach(n->System.out.println(n));
    }
}
