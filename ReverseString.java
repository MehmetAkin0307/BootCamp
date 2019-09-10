package For_Loop_Constructs;

public class ReverseString {
    public static void main(String[] args) {
        /*
           * take a string variable word. and reverse it using for loop
           * ex: java  avaj
         */

 String word="Mehmet";//5
 String reserved="";

 /*
   * using for loop -loop from length of word-1 until 0.
   * and use either charAt or substring and add that character
   * to reversed string
  */

 for (int idx=word.length()-1;idx>=0;idx--){ // 6-1=5 1.t   4 2.e
     reserved=reserved+word.charAt(idx);

        }
        System.out.println(reserved);
    }
}
