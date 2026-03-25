import java.util.Scanner;

public class ReverseString {
    public static String reverseString (String input){
        String rev = "";
        for(int i=input.length()-1; i>=0;i-- ){
            rev = rev+input.charAt(i);
        }
          return rev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String original = sc.nextLine();
        String result = reverseString(original);
        System.out.println("original:" + original);
        System.out.println("reversed:" + result);
        sc.close();
    }
    
}
