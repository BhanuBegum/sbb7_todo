import java.util.Scanner;
class Codechef{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int t= read.nextInt();
        for (int i=0;i<t;i++){
            int n=read.nextInt();
            int a= read.nextInt();
            int b= read.nextInt();
            if(n%a==0&n%b==0){
                System.out.println("N is divisible by A and B");
            }
            else if(n%a==0&&n%b!=0){
                System.out.println("N is divisible by only A");
            } else if (n%a!=0&&n%b==0) {
                System.out.println("N is divisible by only B");
            } else if(n%a!=0&n%b!=0){
                System.out.println("N is divisible by neither A nor B");
            }
        }
    }
}