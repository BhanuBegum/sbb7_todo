import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x= sc.nextInt();
        for(int i=2;i<x;i++){
            if(x%i==0){
                System.out.println("Not Prime");
                break;
            }
            else{
                System.out.println("prime");
                break;
            }
        }
    }
}