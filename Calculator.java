import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        try{
            double a = in.nextDouble();
        }
        catch
        {
            
        }
        
        System.out.print("Выберите действие: 1 - сумма, 2 - вычитание, 3 - умножение, 4 - деление: ");
        int act = in.nextInt();
        System.out.print("Введите второе число: ");
        double b = in.nextDouble();

    }
}
