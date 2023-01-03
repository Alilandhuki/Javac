/*Составить программу, которая печатает заданное слово, начиная с последней
буквы*/
import java.util.Scanner;
public class string_9_42{
    public static void main(String args[]) {
        String aspan, rev = "";
        Scanner ali = new Scanner(System.in);
        System.out.println("Enter your word: ");
        aspan = ali.nextLine();
        int length = aspan.length();
        for(int i = length-1; i >= 0; i--)
            rev = rev + aspan.charAt(i);
        System.out.println("Your word: " + rev);
    }
}
