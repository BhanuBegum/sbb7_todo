import java.util.Scanner;
class Codechef{
    public static void main(String[] args){
        int i = 13;
        short s = 13;
        byte b = 13;
        Scanner sc=new Scanner();
        byte j=sc.n

        System.out.println("i: " + String.format("%32s",
                Integer.toBinaryString(i)).replaceAll(" ", "0"));

        System.out.println("s: " + String.format("%16s",
                Integer.toBinaryString(0xFFFF & s)).replaceAll(" ", "0"));

        System.out.println("b: " + String.format("%8s",
                Integer.toBinaryString(0xFF & b)).replaceAll(" ", "0"));

    }
}