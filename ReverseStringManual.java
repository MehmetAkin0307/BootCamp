package StringReverse;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseStringManual {
    public static String reverseString(String str){

        String newString="";
        for (int i=str.length()-1;i>=0;i--){

            newString=newString+str.charAt(i);
        }
        return newString;
    }
    public static void reverseArrayList(ArrayList<String> arr){
        ArrayList<String> reserved=new ArrayList<String>();
        for (int i=arr.size()-1;i>=0;i--){
            reserved.add(reverseString(arr.get(i)));
        }
        System.out.println(reserved);
}
    public static void main(String[] args) {

        System.out.println(reverseString("Sampiyon Besiktas"));

        ArrayList<String>myArray=new ArrayList<String>(Arrays.asList("vatan","Turkiye"));
        System.out.println(myArray);
    }
}