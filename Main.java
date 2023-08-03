import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Insert int value");
        printValidValue(sc, "[0-9]+");

        System.out.println("Insert name");
        printValidValue(sc, "[a-zA-Z]+");            
    }
}

static void printValidValue(Scanner sc, String pattern) {
    while (sc.hasNextLine()) {
        try {
            System.out.println("Value accepted: " + sc.next(pattern));
            break;
        } catch (InputMismatchException e) {
            System.out.println("Invalid value");
            sc.nextLine();
        }
    }
}
}
