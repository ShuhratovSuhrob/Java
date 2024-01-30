import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        int a = scanner.nextInt();
        System.out.print("Second number: ");
        int b = scanner.nextInt();

        System.out.println("What do you want to do: sum, substract, multiply or divide? ");
        String solution = scanner.next();
        if (solution.equals("sum")) {
            int sum = a + b;
            System.out.println("The sum of the given numbers is: " + sum);
        }
        if (solution.equals("substract")) {
            int substract = a - b;
            System.out.println("The substract of the given numbers is: " + substract);
        }
        if (solution.equals("multiply")) {
            int multiply = a * b;
            System.out.println("The multiply of the given numbers is: " + multiply);
        }
        if (solution.equals("divide")) {
            float divide = (float) a / b;
            System.out.println("The division of the given numbers is: " + divide);
        }
    }
}
