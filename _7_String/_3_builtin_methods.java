package _7_String;

public class _3_builtin_methods {
    static void main(String[] args) {
        String s ="Mayank";
        System.out.println(s.indexOf('y'));
        System.out.println(s.indexOf('a'));// a comes two times but it return the first appearance
        System.out.println(s.indexOf('p'));//returns -1 as it doesns have any p
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("ayan"));//returns boolean;
        System.out.println(s.startsWith("May"));
        System.out.println(s.endsWith("ank"));

        //immutability
        s.toUpperCase();
        System.out.println(s);//doesnt converts it wanna do so then s= s.toUpperCase();

        //COMPARE TO
        //--->compares two strings lexographically
        String a="raghav";
        String b ="sneha";
        System.out.println(a.compareTo(b)); //here the diff bw r and s is -1;
        String s1="harmeet";
        String s2="harsh";
        System.out.println(s1.compareTo(s2)); // har is same prints the diff of m and s ;
        String new1="harshita";
        String new2="harsh";
        System.out.println(new1.compareTo(new2));//gives 3 as there are 3 extra letter after the length
        //CONCAT
        System.out.println(s1.concat(s2));
        //String plus int
        s+="Soni";
        System.out.println(s);
        System.out.println("mayank"+10+20);//-->mayank1020
        System.out.println(10+20+"mayank");//-->30mayank
        System.out.println(10+"mayank"+20);//-->10mayank20
        //CHAR-ARRAY
        char[] arr= s.toCharArray();
        for(char ch: arr){
            System.out.println(ch);
        }
        //s.charAt[0]='p'--->cant do that immuatabe stuff;

        }
}
