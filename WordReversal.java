import java.util.Arrays;
import java.util.Scanner;

public class WordReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        String firstWord = words[0];
        System.out.println("The first word is: " + firstWord);

        int lastIndex = words.length - 1;
        String lastWord = words[lastIndex];
        System.out.println("The last word is: " + lastWord);


        String[] wordsWithoutFirstAndLast = new String[words.length - 2];
        System.arraycopy(words, 1, wordsWithoutFirstAndLast, 0, words.length - 2);

        System.out.println(lastWord + " " + Arrays.toString(wordsWithoutFirstAndLast) + " " + firstWord);
    }
}