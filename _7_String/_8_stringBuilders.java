package _7_String;

public class _8_stringBuilders {
    static void main(String[] args) {
        StringBuilder s= new StringBuilder("Mayank");
        System.out.println(s.length()+" "+s.capacity());
        s.append("soni");
        System.out.println(s);
        s.setCharAt(6,'S');
        System.out.println(s);

    }
}
