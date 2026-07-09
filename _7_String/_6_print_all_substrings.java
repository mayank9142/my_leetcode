package _7_String;

public class _6_print_all_substrings {
    static void main(String[] args) {
        String s="gopi";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
