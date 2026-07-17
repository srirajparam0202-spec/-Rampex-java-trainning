package Day_19;


import java.util.HashMap;
import java.util.Map;
    public class HashMapMin {
        public static void main(String[] args){


            HashMap<String,Integer> hm=new  HashMap<String,Integer>();
            hm.put("sriraj",70);
            hm.put("selva",90);

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
