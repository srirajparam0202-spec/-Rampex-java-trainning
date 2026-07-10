package Day_12.classwork;

public class anagram {

    public static void main(String[] args) {


        System.out.println(isAnagram("pot", "top"));

        isAnagram("pot", "top");

    }

    public static boolean isAnagram(String s1, String s2) {

        //input 2  String arguments
        //o/p : true or false
        //steps: 1. check and compare the length of
        // both strings
        // 2.if length not same return false ,
        // else check further

        if (s1.length() == s2.length()) {

            // further check    //s1 =pot
            // s2 =top


            for (int j = 0; j < s2.length(); j++) {

                for (int i = 0; i < s1.length(); i++) {  //top

                    if (s1.charAt(j) == s2.charAt(i)) {


                        return true;
                    }


                }
            }

        }

        return false;
    }
}











