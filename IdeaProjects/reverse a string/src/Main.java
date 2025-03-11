import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char ch;
        String s="java";
        String r="";
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            r=ch+r;
        }
        System.out.println(r);
    }
}