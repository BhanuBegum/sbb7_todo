import java.util.Arrays;
import java.util.Scanner;

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str= sc.next();
        String r="";
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            r=ch+r;
        }
        if(str.toLowerCase().equals(r.toLowerCase())){
            System.out.println("Palindrome");

        }
        else {
            System.out.println("Not palindrome");

        }
    }
}*/
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("str1:");
        String str1=scanner.next();
        System.out.println("str2:");
        String str2=scanner.next();
        char [] chararr1=str1.toCharArray();
        char[] chararr2=str2.toCharArray();
        Arrays.sort(chararr1);
        Arrays.sort(chararr2);
        if(Arrays.equals(chararr1,chararr2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not anagram");
        }
    }
}