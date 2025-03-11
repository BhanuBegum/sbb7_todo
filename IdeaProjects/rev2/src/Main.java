import java.util.Scanner;

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int x=sc.nextInt();

        int r=0;
        while(x!=0){
            int id=x%10;

            if(r>Integer.MAX_VALUE-id/10||r<Integer.MIN_VALUE-id/10){
                return;
            }
            r=r*10+id;
            x=x/10;
        }
        System.out.println(r);
    }
}*/
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s= sc.next();
        String r="";
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            r=ch+r;
        }
        System.out.println(r);
    }
}