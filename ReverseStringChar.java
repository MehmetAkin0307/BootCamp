public class ReverseStringChar {
    public static void main(String[] args) {
        String input="QA Automation Bootcamp";
        for (int i=input.length()-1;i>=0;i--){
            System.out.print(input.charAt(i));
        }
    }
}
