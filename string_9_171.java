import java.util.Scanner;
public class string_9_171 {
    public static void main(String[] args) {
        Scanner ali = new Scanner(System.in);
        String string = ali.nextLine();
        String[] words = string.split(" ");
        String kishkentai = words[0];
        for (String word : words) {
            if (kishkentai.length() > word.length())
                kishkentai = word;
        }
        System.out.println( kishkentai);
    }
}
