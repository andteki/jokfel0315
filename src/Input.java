import java.util.Scanner;

public class Input {
    static Scanner scanner;
    public Input() {
        scanner = new Scanner(System.in);
    }
    public static double input(String message) {
        System.out.print(message + ": ");
        double num = scanner.nextDouble();
        return num;
    }
}
