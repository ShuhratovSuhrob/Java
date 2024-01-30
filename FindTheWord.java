import java.util.Scanner;

public class FindTheWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        int secondToTheIndex = words.length - 2;
        String secondToTheLast = words[secondToTheIndex];

        System.out.println("The second to the last word is: " + secondToTheLast);
    }
}
