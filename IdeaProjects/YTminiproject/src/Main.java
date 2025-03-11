import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNum = (int) (Math.random() * 100);
        int userNum=0;
        do {
            System.out.println("Guess Number:");
            userNum = sc.nextInt();
            if (userNum == myNum) {
                System.out.println("Correct Number");
                break;
            } else if (userNum > myNum) {
                System.out.println("Your number is Large");
                break;
            } else if (userNum < myNum) {
                System.out.println("Your number is too small");
                break;
            } else {
                System.out.println("ERROR: The number should be integer");
            }
        }while (userNum>=0);
        System.out.println("My number was");
        System.out.println(myNum);
    }

}