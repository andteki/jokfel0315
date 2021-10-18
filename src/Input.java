import java.util.Scanner;

public class Input {
    Scanner scanner;
    public void input(String message) {
        System.out.print(message + ": ");
        double num = this.scanner.nextDouble();
    }
}
