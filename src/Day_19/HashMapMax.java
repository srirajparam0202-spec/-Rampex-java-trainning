package Day_19;
import java.util.HashMap;
import java.util.Map;
public class HashMapMax {
    public static void main(String[] args){


        HashMap<String,Integer> hm=new  HashMap<String,Integer>();
        hm.put("Selva",70);
        hm.put("Sriraj",90);

        int min=100;
        String name="";

        for(Map.Entry<String,Integer> e:hm.entrySet()){
            if(e.getValue()<min){
                min=e.getValue();
                name=e.getKey();

            }


        }
        System.out.println(name);
        System.out.println(min);
    }

}
