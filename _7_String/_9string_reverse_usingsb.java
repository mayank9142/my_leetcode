package _7_String;

public class _9string_reverse_usingsb {
    static void main(String[] args) {
        String s="Mayank";
        StringBuilder sb= new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
        //MANUALLY
        int i =0,j=sb.length()-1;
        while(i<=j){
            char temp1= sb.charAt(i);
            char temp2=sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println(sb);
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.insert(1,"a");
        System.out.println(sb);
    }
}
