import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int sum = x+y;
        System.out.println("Sum of your two numbers are: " + sum);
    }
}
