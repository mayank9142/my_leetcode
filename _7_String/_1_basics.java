package _7_String;
import java.util.Scanner;
public class _1_basics {
    static void main(String[] args) {
        String str= "mayank soni ";
        System.out.println(str);
        System.out.println((str.charAt(2)));//str[2];
        Scanner sc = new Scanner (System.in);
        String s =sc.nextLine();// taking string input of whole line
        System.out.println(s);
        String t= sc.next(); //taking input first word
        System.out.println(t);

    }
}
